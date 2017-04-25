package com.nsxtreme.zm.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by chris on 4/24/2017.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Events {
    Event Event;
}
