package com.springdata;

import com.springdata.entity.Person;
import com.springdata.service.PersonService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    ConfigurableApplicationContext ctx =
        new AnnotationConfigApplicationContext(PersistenceContext.class);
    PersonService personService = ctx.getBean(PersonService.class);

    // Question 3
    personService.saveData();

    Iterable<Person> personList = personService.findAllData();
    for (Person person : personList) {
      System.out.println(person.getFirstName() + "  " + person.getLastName());
    }

    System.out.println(personService.findPersonById(2));

    System.out.println("---------------Person exists or not  " + personService.personExists(4));

    System.out.println("---------------Total Person " + personService.countAll());

//    personService.deletePerson(3);

    // Question 4 and 5

    System.out.println(
        "--------------Find By First Name   " + personService.findPersonByFirstName("gagan"));
    System.out.println(
        "--------------Find By Last Name   " + personService.findPersonByLastName("prateek"));
    System.out.println("--------------Find By Id   " + personService.personFindById(2));

    // Question 6
    System.out.println("-------------Query for age  " + personService.queryFindAge(24));

    // Question 7
    System.out.println("-------------Query for age  " + personService.queryFirstNameLastName(23));

    // Question 8
    System.out.println("-------------Query for Person " + personService.queryFindAll(24));

    // Question 9
    System.out.println("-------------Query for count  " + personService.queryForCount("gagan"));

    // Quertion 10
    System.out.println("-------------Count by name   " + personService.countPerson("gagan"));
    System.out.println("-------------Distinct Age   " + personService.findDistinctAge(24));
    System.out.println("-------------Or   " + personService.findNameorAge("gagan", 35));
    System.out.println("-------------Abd   " + personService.findNameandAge("gagan", 24));
    System.out.println("-------------Between  " + personService.findBetween(24, 27));
    System.out.println("-------------Less Than  " + personService.lessThanDemo(15000));
    System.out.println("-------------Greater Than  " + personService.greaterThanSalary(15000));
    System.out.println("-------------Like Demo  " + personService.likeDemo("gaga"));
    System.out.println("-------------Not Demo" + personService.notDemo("kushwaha"));

    List<Integer> ageList = Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27);
    System.out.println("-------------In Demo" + personService.inDemo(ageList));

    // Named Native Query
    System.out.println(
        "--------------Named Native Query  " + personService.nativeNamedDemo("gagan"));

    // sorting
    System.out.println("------------------Sort Query Method     "+personService.sortQueryMethod(20));
    System.out.println("------------------Sort   "+personService.sortMethod(20));

    // paging
    System.out.println("--------------------Paging   "+personService.pagebleDemo(22));
  }
}
