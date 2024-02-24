package com.example.swaggercontroller.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SwaggerController {
    @GetMapping(path = "name")
    public String getName(@RequestParam String name) {
        return name;
    }
    @PostMapping(path = "reversed-name")
        public StringBuilder postName(@RequestParam String name) {
            StringBuilder reversedName = new StringBuilder(name);
            return reversedName.reverse();
        }
}

