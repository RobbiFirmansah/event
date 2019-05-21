package com.garagelife.event.event.controller;

import com.garagelife.event.event.model.Event;
import com.garagelife.event.event.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping(method = RequestMethod.GET, value = "/events")
    public List<Event> getAllEvent(){
        return eventService.getAllPost();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/events/{id_event}")
    public Optional<Event> getIdEvent(@PathVariable(value = "id_event") Long idEvent){
        return eventService.getIdEvent(idEvent);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/events/add")
    public void addEvent(@RequestBody Event event){
        eventService.addEvent(event);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/events/{id_event}")
    public void updateEvent(@RequestBody Event event,@PathVariable Long idEvent){
        eventService.updateEvent(idEvent, event);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/events/{id_event}")
    public void deleteEvent(@PathVariable Long idEvent){
        eventService.deleteEvent(idEvent);
    }
}
