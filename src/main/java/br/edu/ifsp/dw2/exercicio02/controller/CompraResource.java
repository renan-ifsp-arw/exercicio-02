package br.edu.ifsp.dw2.exercicio02.controller;

import br.edu.ifsp.dw2.exercicio02.exceptions.compra.CompraInvalidaException;
import br.edu.ifsp.dw2.exercicio02.model.Compra;
import br.edu.ifsp.dw2.exercicio02.service.CompraService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompraResource {

    @Autowired
    private CompraService compraService;

    @GetMapping("/compra")
    public List<Compra> list(){
        return compraService.list();
    }

    @PostMapping("/compra")
    public ResponseEntity<?> create(@RequestBody Compra compra, HttpServletResponse response){
        try {
            compraService.save(compra);
            return ResponseEntity.ok(compra);
        } catch (CompraInvalidaException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<Compra> findById(@PathVariable Long id){
        Optional<Compra> compra = compraService.findById(id);
        return compra.isPresent() ? ResponseEntity.ok(compra.get()) : ResponseEntity.notFound().build();
    }
}
