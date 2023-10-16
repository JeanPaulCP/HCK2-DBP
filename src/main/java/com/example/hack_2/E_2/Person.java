package com.example.hack_2.E_2;

import com.example.hack_2.E_1.Group;
import jakarta.persistence.*;
import java.util.List; // Importamos la clase List

@Entity
@Table(name = "person")
public class Person{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @OneToMany
    private List<Group> groups;

    // Constructores

    public Person() {} // Constructor vacío

    public Person(Long id, String name, List<Group> groups) {
        this.id = id;
        this.name = name;
        this.groups = groups;
    }

    // Getters

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Group> getGroups() {
        return this.groups;
    }

    // Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

}
