package com.example.hack_2.controllers;


import com.example.hack_2.entities.TypeGroup;
import com.example.hack_2.services.TypeGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/type-groups")
@CrossOrigin(origins = "http://localhost:3000")
public class TypeGroupController {

    @Autowired
    private TypeGroupService typeGroupService;

    @Autowired
    public TypeGroupController(TypeGroupService typeGroupService) {
        Assert.notNull(typeGroupService, "GroupService must not be null!");
        this.typeGroupService = typeGroupService;
    }

    @GetMapping
    public ResponseEntity<List<TypeGroup>> getAllTypeGroups() {
        List<TypeGroup> typeGroups = typeGroupService.getAllTypeGroups();
        return ResponseEntity.ok(typeGroups);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeGroup> getTypeGroupById(@PathVariable Long id) {
        TypeGroup typeGroup = typeGroupService.getTypeGroupById(id);
        if (typeGroup != null) {
            return ResponseEntity.ok(typeGroup);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<TypeGroup> createTypeGroup(@RequestBody TypeGroup typeGroup) {
        TypeGroup createdTypeGroup = typeGroupService.createGroup(typeGroup);
        return ResponseEntity.ok(createdTypeGroup);
    }

}
