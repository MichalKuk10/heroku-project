package com.example.myprojectheroku.controller;
import com.example.myprojectheroku.model.User;
import com.example.myprojectheroku.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RestController
public class Controller {

    private UserService userService;


    @GetMapping("/")
    @ResponseStatus(OK)
    public String helloHeroku() {
        return "Hello heroku!";
    }

    @GetMapping("/{name}")
    @ResponseBody
    @ResponseStatus(OK)
    public String helloName(@PathVariable("name") String name) {
        return "Hello " + name + " !";
    }

    @PostMapping("/{name}")
    @ResponseBody
    @ResponseStatus(CREATED)
    public void attemptToAddUser(@RequestBody String name) {
        User user = new User(name);
        userService.addUser(user);

    }

}
