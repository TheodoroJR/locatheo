package br.com.locatheo.locatheo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @GetMapping
    public String geVeiculos(){
        return "Hello Veiculos";
    }

}
