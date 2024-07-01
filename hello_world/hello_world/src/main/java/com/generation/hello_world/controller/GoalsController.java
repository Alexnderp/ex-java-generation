package com.generation.hello_world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/goals")
public class GoalsController {
    ArrayList<String> goals = new ArrayList<>();

    @GetMapping
    public String showGoals(){
        goals.add("Spring Boot");
        goals.add("Gestão Financeira");
        goals.add("Spring Framework");
        goals.add("Resolução Estratégica de Problemas");
        goals.add("Planejamento para o Crescimento e Desenvolvimento da Carreira");
        goals.add("Spring Data JPA");
        goals.add("REST API com Spring Boot");

        StringBuilder list = new StringBuilder();
        list.append("BSM's: \n");
        for (String value : goals) {
            list.append("- ").append(value).append("\n");
        }

        return list.toString();

    }
}
