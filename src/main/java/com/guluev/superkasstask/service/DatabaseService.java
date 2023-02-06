package com.guluev.superkasstask.service;

import com.guluev.superkasstask.model.Request;
import com.guluev.superkasstask.model.UserCurrentNumber;
import com.guluev.superkasstask.repository.DatabaseRepository;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    private final DatabaseRepository repository;

    public DatabaseService(DatabaseRepository repository) {
        this.repository = repository;
    }

    public UserCurrentNumber modify(Request request) {
        var result = repository.getReferenceById(request.getId());
        var userCurrentNumber = new UserCurrentNumber();

        userCurrentNumber.setCurrent(request.getAdd());
        result.setObj(userCurrentNumber);
        var updateUser = repository.save(result);

        return updateUser.getObj();
    }

}
