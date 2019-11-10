package com.example.the_code;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller

public class HomeController {

    @RequestMapping(value="/")
    public String index() {
        return "index.jsp";

    }

    @RequestMapping(value="/code", method=RequestMethod.POST)
    public String code(RedirectAttributes redirectAttributes,@RequestParam(value="code") String code) {
        if(code.equals("bushido")){
            return  "code.jsp";
        }
        else{
            redirectAttributes.addFlashAttribute("error", "You Must train harder!");
            System.out.println(code);

            return "redirect:/";
        }

    }
}
