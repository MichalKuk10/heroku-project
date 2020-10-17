package com.example.myprojectheroku;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping("/")
public class Controller {

    @ResponseBody
    @ResponseStatus(OK)
    public String helloHeroku() {
        return "Hello heroku!";
    }
}
