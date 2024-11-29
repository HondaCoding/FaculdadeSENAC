package com.Pizzaria.Honda.service;

import com.Pizzaria.Honda.model.Pizza;
import com.Pizzaria.Honda.model.Sabor;
import com.Pizzaria.Honda.model.Tamanho;
import com.Pizzaria.Honda.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public Pizza criarPizza(Pizza pizza){
        return pizzaRepository.save(pizza);
    }

    public List<Pizza> listarPizzas(){
        return pizzaRepository.findAll();
    }

    public Optional<Pizza> obterPizzaPorId(Long id){
        return pizzaRepository.findById(id);
    }

    public Pizza atualizarPizza(Long id, Pizza pizza) {
        Optional<Pizza> pizzaAntiga = pizzaRepository.findById(id);

        if (pizzaAntiga.isPresent()) {
            Pizza pizzaNova = pizzaAntiga.get();

            pizza.setNome(pizza.getNome());
            pizza.setTamanho(pizza.getTamanho());
            pizza.setPreco(pizza.getPreco());
            pizza.setSabores(pizza.getSabores());

            return pizzaRepository.save(pizza);
        } else {
            return null;
        }
    }

    public void excluirPizza(Long id){
        pizzaRepository.deleteById(id);
    }
}
