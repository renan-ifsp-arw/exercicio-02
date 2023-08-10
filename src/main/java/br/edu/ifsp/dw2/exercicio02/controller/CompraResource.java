package br.edu.ifsp.dw2.exercicio02.controller;

import br.edu.ifsp.dw2.exercicio02.model.Compra;
import br.edu.ifsp.dw2.exercicio02.service.CompraService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping("/compra")
    public List<Compra> list(){
        return compraService.list();
    }

    @PostMapping("/compra")
    public Compra create(@RequestBody Compra compra, HttpServletResponse response){
        return compraService.save(compra);
    }
}
