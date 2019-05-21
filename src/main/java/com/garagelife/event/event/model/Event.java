package com.garagelife.event.event.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

@Entity
public class Event {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_event", updatable = false, nullable = false)
    private Long idEvent;
    @Column(name = "title_event")
    private String titleEvent;
    @Column(name = "desc_event")
    private String descEvent;
    @Column(name = "start_event")
    private String startEvent;
    @Column(name = "end_event")
    private String endEvent;
    @Column(name = "loc_event")
    private String locEvent;

    public Long getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(Long idEvent) {
        this.idEvent = idEvent;
    }

    public String getTitleEvent() {
        return titleEvent;
    }

    public void setTitleEvent(String titleEvent) {
        this.titleEvent = titleEvent;
    }

    public String getDescEvent() {
        return descEvent;
    }

    public void setDescEvent(String descEvent) {
        this.descEvent = descEvent;
    }

    public String getStartEvent() {
        return startEvent;
    }

    public void setStartEvent(String startEvent) {
        this.startEvent = startEvent;
    }

    public String getEndEvent() {
        return endEvent;
    }

    public void setEndEvent(String endEvent) {
        this.endEvent = endEvent;
    }

    public String getLocEvent() {
        return locEvent;
    }

    public void setLocEvent(String locEvent) {
        this.locEvent = locEvent;
    }
}
