package com.nsxtreme.zm.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by chris on 4/24/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventList {
    List<Event> events;
    Pagination pagination;


    @Override
    public String toString() {
        return String.valueOf(events.size());
    }
}
