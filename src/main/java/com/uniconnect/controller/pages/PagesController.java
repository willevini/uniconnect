package com.uniconnect.controller.pages;

import com.uniconnect.model.event.Event;
import com.uniconnect.service.event.EventService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PagesController {

    private final EventService eventService;

    public PagesController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping({"/", "/index"})
    public ModelAndView index() {
        List<Event> events = eventService.findAll();

        ModelAndView modelAndView = new ModelAndView("externalPages/home/index");
        modelAndView.addObject("events", events);

        return modelAndView;
    }
}
