/**
 * Created by chris on 4/24/2017.
 */
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nsxtreme.zm.models.EventList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;


public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
       /* RestTemplate restTemplate = new RestTemplate();
        EventList list = restTemplate.getForObject("http://surveil/zm/api/events.json", EventList.class);
*/
        ObjectMapper mapper = new ObjectMapper();
        EventList list = null;
        try {
            list = mapper.readValue("http://surveil/zm/api/events.json", EventList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }


        log.info(list.toString());
    }

}