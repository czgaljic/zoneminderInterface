package com.nsxtreme.zm.api;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 4/26/2017.
 */
public class ZmApiTest{
    @Test
    public void test_getAllEventsURL(){
        assertEquals("null/zm/api/events.json", ZmApi.getAllEventsURL());
    }

}