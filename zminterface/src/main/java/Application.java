/**
 * Created by chris on 4/24/2017.
 */
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nsxtreme.zm.models.Event;
import com.nsxtreme.zm.models.EventList;
import com.nsxtreme.zm.models.Events;
import org.springframework.web.client.RestTemplate;
import org.apache.log4j.Logger;

public class Application {

    private static final Logger log = Logger.getLogger(Application.class);

    public static void main(String args[]) {
        ObjectMapper mapper = new ObjectMapper();
        RestTemplate restTemplate = new RestTemplate();
        Events list = null;
        list = restTemplate.getForObject("http://surveil/zm/api/events.json", Events.class);
        EventList[] events = list.getEvents();
        Event event = events[0].getEvent();

        log.debug("HELLO");
    }

}