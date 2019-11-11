package com.example.dojo_survey;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String survey(){
        return "index.jsp";
    }
    @RequestMapping(value="/result", method= RequestMethod.POST)
    public String result(@RequestParam(value="name") String name, @RequestParam(value="language") String language, HttpSession session){
        session.setAttribute("name",name);
        session.setAttribute("language",language);
        return "result.jsp";

    }
}
