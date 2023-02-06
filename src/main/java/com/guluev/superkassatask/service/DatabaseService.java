package com.guluev.superkassatask.service;

import com.guluev.superkassatask.model.Request;
import com.guluev.superkassatask.model.UserCurrentNumber;
import com.guluev.superkassatask.repository.DatabaseRepository;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    private final DatabaseRepository repository;

    public DatabaseService(DatabaseRepository repository) {
        this.repository = repository;
    }

    public UserCurrentNumber modify(Request request) {
        var result = repository.findById(request.getId()).orElseThrow();
        var userCurrentNumber = new UserCurrentNumber();

        userCurrentNumber.setCurrent(request.getAdd());
        result.setObj(userCurrentNumber);

        var updateUser = repository.save(result);

        return updateUser.getObj();
    }

}
