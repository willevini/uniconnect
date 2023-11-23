package com.uniconnect.controller.event;

import com.uniconnect.model.event.EventSaveForm;
import com.uniconnect.service.event.EventService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("event")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("eventSaveForm", new EventSaveForm());
        return "event/create";
    }

    @PostMapping("save")
    public String save(@Valid EventSaveForm eventSaveForm, BindingResult result) {
        eventService.save(eventSaveForm);
        return "event/create";
    }
}
