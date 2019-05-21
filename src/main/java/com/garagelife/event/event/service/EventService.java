package com.garagelife.event.event.service;

import com.garagelife.event.event.model.Event;
import com.garagelife.event.event.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    EventRepository eventRepository;

    public List<Event> getAllPost(){
        List<Event> events = new ArrayList<>();
        eventRepository.findAll()
                .forEach(events::add);
        return events;
    }
    public Optional<Event> getIdEvent(Long idEvent){
        return eventRepository.findById(idEvent);
    }
    public void addEvent(Event event){
        eventRepository.save(event);
    }
    public void updateEvent(Long idEvent, Event event){
        eventRepository.save(event);
    }
    public void deleteEvent(Long idEvent){
        eventRepository.deleteById(idEvent);
    }
}
