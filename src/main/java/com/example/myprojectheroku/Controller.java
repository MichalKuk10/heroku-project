package com.example.myprojectheroku;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class Controller {


    @GetMapping("/")
    @ResponseStatus(OK)
    public String helloHeroku() {
        return "Hello heroku!";
    }

    @GetMapping("/{name}")
    @ResponseBody
    @ResponseStatus(OK)
    public String helloName(@PathVariable("name") String name) {
        return "Hello" + name;
    }

}
