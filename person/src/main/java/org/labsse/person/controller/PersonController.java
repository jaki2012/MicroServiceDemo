package org.labsse.person.controller;

import org.labsse.person.dao.PersonRepository;
import org.labsse.person.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lijiechu
 * @create on 17/3/14
 * @description
 */
@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody String personName) {
        Person p = new Person(personName);
        personRepository.save(p);
        System.out.println("heyusb");
        List<Person> people = personRepository.findAll(new PageRequest(0,10)).getContent();
        return people;
    }
}
