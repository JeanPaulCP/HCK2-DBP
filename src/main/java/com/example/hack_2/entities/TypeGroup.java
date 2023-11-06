package com.example.hack_2.entities;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "type_group")
public class TypeGroup
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private Set<Group> groups;

    // Constructores
    public TypeGroup() {}

    public TypeGroup(String name, Set<Group> groups)
    {
        this.name = name;
        this.groups = groups;
    }

    // Getters y Setters

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Set<Group> getGroups()
    {
        return groups;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setGroups(Set<Group> groups)
    {
        this.groups = groups;
    }
}