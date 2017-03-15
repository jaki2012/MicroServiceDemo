package org.labsse.ui.entity;

/**
 * @author lijiechu
 * @create on 17/3/14
 * @description
 */
public class Person {
    private Long id;

    private String name;


    public Person() {
        super();
    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}