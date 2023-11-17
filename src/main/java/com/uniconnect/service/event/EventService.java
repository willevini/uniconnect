package com.uniconnect.service.event;

import com.uniconnect.model.event.Event;
import com.uniconnect.model.event.EventSaveForm;
import com.uniconnect.repository.event.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public void save(EventSaveForm eventSaveForm) {
        Event event = new Event();
        event.setName(eventSaveForm.getName());
        event.setPlace(eventSaveForm.getPlace());
        event.setStartDate(eventSaveForm.getStartDate());
        event.setEndDate(eventSaveForm.getEndDate());

        eventRepository.save(event);
    }
}
