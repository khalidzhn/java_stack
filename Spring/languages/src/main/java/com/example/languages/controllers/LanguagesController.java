package com.example.languages.controllers;

import com.example.languages.models.Languages;
import com.example.languages.services.LanguagesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class LanguagesController {
    private final LanguagesService languagesService;

    public LanguagesController(LanguagesService languagesService){
        this.languagesService = languagesService;
    }
    @RequestMapping("/languages")
    public String index(Model model){
        List<Languages> languages = languagesService.allLanguages();
        model.addAttribute("languages",languages);
        return "Languages/index.jsp";
    }

}
