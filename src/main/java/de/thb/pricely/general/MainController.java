package de.thb.pricely.general;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String showIndexPage(){
        return "index";
    }

    @GetMapping("/about")
    public String showAboutPage(){
        return "about";
    }



    @GetMapping("/contact")
    public String showContactPage(){
        return "contact";
    }

}
