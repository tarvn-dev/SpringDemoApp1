package cs.tarun.SpringApp1.resource;

import cs.tarun.SpringApp1.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class UserController {
    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "Tarun","tarun@gmail.com"));
        users.add(new User(2, "John","john@gmail.com"));
        users.add(new User(3, "Alice","alice@gmail.com"));
        users.add(new User(4, "Bob","bob@gmail.com"));

        return users;

    }
}
