package com.example.hack_2.E_1;

import com.example.hack_2.E_2.Person;
import jakarta.persistence.*;
import java.util.List; // Importamos la clase List

@Entity
@Table(name = "group")
public class Group{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @OneToMany
    private List<Person> persons;

    // Constructores

    public Group() {} // Constructor vacío

    public Group(Long id, String name, List<Person> persons) {
        this.id = id;
        this.name = name;
        this.persons = persons;
    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Person> getPersons() {
        return this.persons;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

}
