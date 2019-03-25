package com.springdata.repositories;

import com.springdata.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

  @Query("Select firstName from Person where age=:age")
  String findByFirstNameQuery(@Param("age") Integer age);

  @Query("SELECT p.firstName,p.lastName from Person p where age=:age")
  String findByFirstNameLastNameQuery(@Param("age") Integer age);

  Person findByFirstName(String name);

  Person findByLastName(String name);

  Person findById(Integer id);

  @Query("Select count(*) from Person p where p.firstName=:name")
  int countQuery(@Param("name") String name);

  @Query("select p from Person p where p.age=:age")
  Person findAllQuery(@Param("age") Integer age);

  int countByFirstName(String name);

  Person findDistinctByAge(Integer age);

  Person findByFirstNameOrAge(String firstName, Integer age);

  Person findByFirstNameAndAge(String name, Integer age);

  List<Person> findByAgeBetween(int start, int end);

  List<Person> findBySalaryLessThan(int salary);

  List<Person> findBySalaryGreaterThan(int salary);

  Person findByFirstNameLike(String name);

  List<Person> findByLastNameNot(String lastName);

  List<Person> findByAgeIn(Collection<Integer> age);

  Person findByNameIs(@Param("name") String name);

  List<Person> findByAgeGreaterThanOrderByIdDesc(int age);

  List<Person> findAll(Sort sort);

  Page<Person> findAll(Pageable pageable);
}
