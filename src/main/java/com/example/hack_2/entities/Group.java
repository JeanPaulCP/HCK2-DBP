package com.example.hack_2.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(
            name = "person_group",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "person_id")
    )
    private Set<Person> persons = new HashSet<>(); // new HashSet<> sirve para inicializar el Set

    @ManyToOne
    @JoinColumn(name = "type_group_id")
    private TypeGroup typeGroup;

    // @JoinColumn sirve para indicar que se va a crear una columna en la tabla de la entidad actual

    // JoinTable es para indicar que se va a crear una tabla intermedia

    // Constructors, getters, and setters
    public Group() {
    }

    public Group(String name, Set<Person> persons, TypeGroup typeGroup) {
        this.name = name;
        this.persons = persons;
        this.typeGroup = typeGroup;
    }

    public Long getId() {
        return id;
    }

    public String getName() { 
        return name; 
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public TypeGroup getTypeGroup() {
        return typeGroup;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    public void setTypeGroup(TypeGroup typeGroup) {
        this.typeGroup = typeGroup;
    }
}
