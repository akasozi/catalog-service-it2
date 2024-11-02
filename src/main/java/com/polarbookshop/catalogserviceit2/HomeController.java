package com.polarbookshop.catalogserviceit2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String getString() {
        return "Welcome to the book catalog!";
    }
}
