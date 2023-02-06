package com.guluev.superkassatask.repository;

import com.guluev.superkassatask.entity.ExampleTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseRepository extends CrudRepository<ExampleTable, Integer> {
}