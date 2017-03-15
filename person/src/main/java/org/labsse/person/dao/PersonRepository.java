package org.labsse.person.dao;

import org.labsse.person.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lijiechu
 * @create on 17/3/14
 * @description
 */
public interface PersonRepository extends JpaRepository<Person, Long>{
}
