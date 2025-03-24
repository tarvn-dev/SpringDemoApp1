package cs.tarun.SpringApp1.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Welcome to my REST API";
    }

    @GetMapping("/about")
    public String sayAbout(){
        return "This API was developed by Tarun";
    }

    @GetMapping("/contact")
    public String sayContact(){
        return "Phone Number: 01325303515";
    }

    @GetMapping("/")
    public String sayWelcome(){
        return "Welcome to the Homepage!";
    }
}
