package com.uniconnect.controller.event;

import com.uniconnect.model.event.EventSaveForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("event")
public class EventController {


    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("customerSaveForm", new EventSaveForm());
        return "event/create";
    }
}
