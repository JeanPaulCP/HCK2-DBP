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
}
