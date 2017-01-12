package personal.tempesieve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * $Author: ecortez
 * $Date: 1/11/2017
 */

@SpringBootApplication
@RestController
public class Application {
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
