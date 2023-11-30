package com.uniconnect.controller.externalPages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExternalPagesController {

    @GetMapping({"/", "/index"})
    public String home() {
        return "externalPages/home/index";
    }
}
