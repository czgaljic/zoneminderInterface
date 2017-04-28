package com.nsxtreme.zm.api;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Locale;

/**
 * Created by chris on 4/26/2017.
 */
@Component
public class ZmApi {
    @Value("${api.serverRootURL}")
    private static String serverURL;
    private static final String ALL_EVENTS="zm/api/events.json";
    private static final String DATE_RANGE="zm/api/events/index/StartTime%20>=:%1/EndTime%20<=:%2.json";
    //http://surveil/zm/api/events/index/StartTime%20%3E=:2017-04-25%2018:43:56/EndTime%20%3C=:2017-04-27%2014:00:56.json?page=2

    public static String getAllEventsURL(){
        return serverURL+"/"+ALL_EVENTS;
    }

    public static String getEventsDateRange(LocalDateTime start, LocalDateTime end){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String startString =start.format(formatter);
        String endString = end.format(formatter);

        StringBuilder sb = new StringBuilder();
        Formatter formatter1 = new Formatter(sb, Locale.US);
        formatter1.format(DATE_RANGE,startString,endString);
        return sb.toString();
    }
}
