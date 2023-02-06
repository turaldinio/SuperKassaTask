package com.guluev.superkasstask.repository;

import com.guluev.superkasstask.entity.ExampleTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatabaseRepository extends JpaRepository<ExampleTable, Integer> {
}