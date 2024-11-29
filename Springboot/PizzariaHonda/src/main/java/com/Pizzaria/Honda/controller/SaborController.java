package com.Pizzaria.Honda.controller;

import com.Pizzaria.Honda.model.Sabor;
import com.Pizzaria.Honda.service.SaborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sabores")
public class SaborController {

    @Autowired
    private SaborService saborService;

    @PostMapping
    public ResponseEntity<Sabor> criarSabor(@RequestBody Sabor sabor){
        return ResponseEntity.ok(saborService.criarSabor(sabor));
    }

    @GetMapping
    public List<Sabor> listarSabores(){
        return saborService.listarSabores();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sabor> obterSabor(@PathVariable Long id) {
        Optional<Sabor> sabor = saborService.obterSaborPorId(id);
        return sabor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sabor> atualizarSabor(@PathVariable Long id, @RequestBody Sabor sabor){
        return ResponseEntity.ok(saborService.atualizarSabor(id, sabor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Sabor> deletarSabor(@PathVariable Long id){
        saborService.excluirSabor(id);
        return ResponseEntity.noContent().build();
    }


}
