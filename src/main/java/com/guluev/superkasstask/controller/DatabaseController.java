package com.guluev.superkasstask.controller;

import com.guluev.superkasstask.model.Request;
import com.guluev.superkasstask.model.UserCurrentNumber;
import com.guluev.superkasstask.service.DatabaseService;
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
