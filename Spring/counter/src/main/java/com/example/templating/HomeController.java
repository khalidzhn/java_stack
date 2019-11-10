package com.example.templating;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(HttpSession session){
        if(session.getAttribute("count")==null) {
            Integer count = 0;
            session.setAttribute("count", count);
        }
        Integer count = (Integer) session.getAttribute("count");
        count++;
        session.setAttribute("count",count);

        return "index.jsp";
    }
}
