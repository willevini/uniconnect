package com.uniconnect.repository.event;

import com.uniconnect.model.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventRepository extends JpaRepository<Event, Long> {

    List<Event> findAllByDeletedFalse();
}
