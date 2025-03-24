package cs.tarun.SpringApp1.resource;

import cs.tarun.SpringApp1.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users2")
public class UserController2 {

    //Global
    private List<User> users;

    //Constructor
    public UserController2(){
        users = new ArrayList<>();
        users.add(new User(1, "Tarun", "tarun@op.ac.nz"));
        users.add(new User(1, "John", "john@op.ac.nz"));
    }

    //Read data
    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    //Add data
    @PostMapping
    public String addUser(@RequestBody User user){
        users.add(user);
        return "User added";
    }

    //Delete Data
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        for (User u:users){
            if (u.getId() == id){
                users.remove(u);
                return "User was deleted successfully";
            }
        }
        return "User was not found";
    }

    //Update data
    @PutMapping
    public String updateUser(@RequestBody User user){
        int id = user.getId();
        for (User u:users){
            if (u.getId() == id){
                u.setName((user.getName()));
                u.setName((user.getEmail()));
                return "User was updated successfully";
            }
        }
        return "User was not found";
    }
}
