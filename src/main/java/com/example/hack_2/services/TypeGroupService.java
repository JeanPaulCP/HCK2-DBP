package com.example.hack_2.services;

import com.example.hack_2.entities.TypeGroup;
import com.example.hack_2.repositories.TypeGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeGroupService {

    @Autowired
    private TypeGroupRepository TypeGroupRepository;

    public TypeGroup createGroup(TypeGroup typeGroup) {
        return TypeGroupRepository.save(typeGroup);
    }

    public List<TypeGroup> getAllTypeGroups() {
        return TypeGroupRepository.findAll();
    }

    public TypeGroup getTypeGroupById(Long id) {
        return TypeGroupRepository.findById(id).orElse(null);
    }

}
