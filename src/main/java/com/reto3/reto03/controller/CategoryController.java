package com.reto3.reto03.controller;


import com.reto3.reto03.entities.Category;
import com.reto3.reto03.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {

    @Autowired
    private CategoryService categoryservice;

    @GetMapping("/all")
    public List<Category> getAll(){
        return categoryservice.getAll();
    }
   @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category p){
        return categoryservice.save(p);
   }

}
