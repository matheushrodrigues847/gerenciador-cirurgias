package com.matheus.gerenciadorCirurgias.controller;

import com.matheus.gerenciadorCirurgias.model.Cirurgia;
import com.matheus.gerenciadorCirurgias.repository.CirurgiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {
    @Autowired
    private CirurgiaRepository cirurgiaRepository;

    @GetMapping
    public String home(Model model){
        List<Cirurgia> cirurgias = (List<Cirurgia>) cirurgiaRepository.findAll();

        model.addAttribute("cirurgias",cirurgias);

        return "home";
    }
}
