/**
 * Created by chris on 4/24/2017.
 */
import com.nsxtreme.zm.models.Events;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    private static final Logger log = Logger.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate)throws Exception{
        return args -> {
            Events list = restTemplate.getForObject("http://surveil/zm/api/events.json",Events.class);
            log.debug(list.toString());
        };
    }

}