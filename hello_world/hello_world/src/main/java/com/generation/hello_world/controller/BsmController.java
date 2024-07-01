package com.generation.hello_world.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/bsm")
public class BsmController {
    ArrayList<String> bsm = new ArrayList<>();

    @GetMapping
    public String showBsm(){
        bsm.add("Mentalidade de crescimento");
        bsm.add("responsabilidade pessoal");
        bsm.add("orientação ao futuro");
        bsm.add("persistência");
        bsm.add("Comunicação");
        bsm.add("Proatividade");
        bsm.add("Orientação ao detalhe");
        bsm.add("trabalho em equipe");

        StringBuilder list = new StringBuilder();
        list.append("BSM's: \n");
        for (String value : bsm) {
            list.append("- ").append(value).append("\n");
        }

        return list.toString();
    }

}
