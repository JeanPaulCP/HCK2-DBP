package com.example.hack_2.repositories;

import com.example.hack_2.entities.TypeGroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeGroupRepository extends JpaRepository<TypeGroup, Long>
{

}
