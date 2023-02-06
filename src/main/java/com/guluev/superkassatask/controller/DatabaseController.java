package com.guluev.superkassatask.controller;

import com.guluev.superkassatask.model.Request;
import com.guluev.superkassatask.model.UserCurrentNumber;
import com.guluev.superkassatask.service.DatabaseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
    private final DatabaseService service;

    public DatabaseController(DatabaseService service) {
        this.service = service;
    }

    @PostMapping("/modify")
    public UserCurrentNumber modify(@RequestBody Request request) {
        return service.modify(request);
    }

}
