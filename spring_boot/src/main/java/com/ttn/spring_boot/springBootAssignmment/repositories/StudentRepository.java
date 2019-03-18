package com.ttn.spring_boot.springBootAssignmment.repositories;

import com.ttn.spring_boot.springBootAssignmment.entities.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Students,Integer> {
}
