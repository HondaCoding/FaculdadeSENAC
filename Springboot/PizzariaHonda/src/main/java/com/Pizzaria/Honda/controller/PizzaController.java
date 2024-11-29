package com.Pizzaria.Honda.controller;

import com.Pizzaria.Honda.model.Pizza;
import com.Pizzaria.Honda.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @PostMapping
    public ResponseEntity<Pizza> criarPizza(@RequestBody Pizza pizza) {
        return ResponseEntity.ok(pizzaService.criarPizza(pizza));
    }

    @GetMapping
    public List<Pizza> listarPizzas() {
        return pizzaService.listarPizzas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pizza> obterPizza(@PathVariable Long id) {
        Optional<Pizza> pizza = pizzaService.obterPizzaPorId(id);
        return pizza.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pizza> atualizarPizza(@PathVariable Long id, @RequestBody Pizza pizza) {
        return ResponseEntity.ok(pizzaService.atualizarPizza(id, pizza));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirPizza(@PathVariable Long id) {
        pizzaService.excluirPizza(id);
        return ResponseEntity.noContent().build();
    }

}
