package com.Pizzaria.Honda.service;

import com.Pizzaria.Honda.model.Sabor;
import com.Pizzaria.Honda.repository.SaborRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaborService {

    @Autowired
    private SaborRepository saborRepository;

    public Sabor criarSabor(Sabor sabor) {
        return saborRepository.save(sabor);
    }

    public List<Sabor> listarSabores() {
        return saborRepository.findAll();
        //List<Sabor> sabores = saborRepository.findAll();
        //System.out.println("Sabores encontrados: " + sabores);
        //return sabores;
    }

    public Optional<Sabor> obterSaborPorId(Long id) {
        return saborRepository.findById(id);
    }

    public Sabor atualizarSabor(Long id, Sabor sabor) {
        Optional<Sabor> antigoSabor = saborRepository.findById(id);

        if (antigoSabor.isPresent()) {
            Sabor novoSabor = antigoSabor.get();
            novoSabor.setNome(sabor.getNome());
            novoSabor.setDescricao(sabor.getDescricao());
            novoSabor.setCategoria(sabor.getCategoria());

            return saborRepository.save(novoSabor);
        } else {
            return null;
        }
    }

    public void excluirSabor(Long id){
        saborRepository.deleteById(id);
    }
}
