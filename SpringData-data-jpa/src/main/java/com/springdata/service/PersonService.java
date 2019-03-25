package com.springdata.service;

import com.springdata.entity.Person;
import com.springdata.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {

  @Autowired PersonRepository personRepository;

  public void saveData() {

    Person person = new Person();
    person.setFirstName("gagan");
    person.setLastName("kushwaha");
    person.setAge(24);
    person.setSalary(15000);

    Person person1 = new Person();
    person1.setFirstName("arpit");
    person1.setLastName("gupta");
    person1.setAge(22);
    person1.setSalary(15000);

    Person person2 = new Person();
    person2.setFirstName("prateek");
    person2.setLastName("nagar");
    person2.setAge(23);
    person2.setSalary(15000);

    personRepository.save(person);
    personRepository.save(person1);
    personRepository.save(person2);
  }

  public Iterable<Person> findAllData() {
    return personRepository.findAll();
  }

  public Person findPersonById(int i) {
    return personRepository.findOne(i);
  }

  public boolean personExists(int id) {
    return personRepository.exists(id);
  }

  public long countAll() {
    return personRepository.count();
  }

  public void deletePerson(int id) {
    personRepository.delete(id);
  }

  public Person findPersonByFirstName(String name) {
    return personRepository.findByFirstName(name);
  }

  public Person findPersonByLastName(String name) {
    return personRepository.findByLastName(name);
  }

  public Person personFindById(Integer id) {
    return personRepository.findById(id);
  }

  public String queryFindAge(Integer age) {
    return personRepository.findByFirstNameQuery(age);
  }

  public String queryFirstNameLastName(Integer age) {
    return personRepository.findByFirstNameLastNameQuery(age);
  }

  public int queryForCount(String name) {
    return personRepository.countQuery(name);
  }

  public Person queryFindAll(Integer age) {
    return personRepository.findAllQuery(age);
  }

  public int countPerson(String name) {
    return personRepository.countByFirstName(name);
  }

  public Person findDistinctAge(Integer age) {
    return personRepository.findDistinctByAge(age);
  }

  public Person findNameorAge(String name, Integer age) {
    return personRepository.findByFirstNameOrAge(name, age);
  }

  public Person findNameandAge(String name, Integer age) {
    return personRepository.findByFirstNameAndAge(name, age);
  }

  public List<Person> findBetween(int start, int end) {
    return personRepository.findByAgeBetween(start, end);
  }

  public List<Person> lessThanDemo(int salary) {
    return personRepository.findBySalaryLessThan(salary);
  }

  public List<Person> greaterThanSalary(int salary) {
    return personRepository.findBySalaryGreaterThan(salary);
  }

  public Person likeDemo(String name) {
    return personRepository.findByFirstNameLike(name);
  }

  public List<Person> notDemo(String name) {
    return personRepository.findByLastNameNot(name);
  }

  public Person nativeNamedDemo(String name) {
    return personRepository.findByNameIs(name);
  }

  public List<Person> inDemo(List<Integer> ageList) {
    return personRepository.findByAgeIn(ageList);
  }

  public List<Person> sortQueryMethod(int age) {
    return personRepository.findByAgeGreaterThanOrderByIdDesc(age);
  }

  public List<Person> sortMethod(int age) {
    return personRepository.findAll(new Sort(Sort.Direction.DESC, "age"));
  }

  public List<Person> pagebleDemo(int id){
    return personRepository.findAll(new PageRequest(0,1,new Sort(Sort.Direction.DESC,"age"))).getContent();
  }


}
