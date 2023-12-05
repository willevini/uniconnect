package com.uniconnect.controller.event;

import com.uniconnect.model.event.EventSaveForm;
import com.uniconnect.service.event.EventService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("event")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("create")
    public String create(Model model) {
        model.addAttribute("eventSaveForm", new EventSaveForm());
        return "internalPages/event/create";
    }

    @PostMapping("save")
    public String save(@Valid EventSaveForm eventSaveForm, BindingResult result) {
        eventService.save(eventSaveForm);
        return "internalPages/event/create";
    }
}
