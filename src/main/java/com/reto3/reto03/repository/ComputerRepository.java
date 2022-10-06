package com.reto3.reto03.repository;

import com.reto3.reto03.entities.Computer;
import com.reto3.reto03.repository.crudRepository.ComputerCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ComputerRepository {
    @Autowired
    private ComputerCrudRepository computerCrudRepository;

    public List<Computer> getAll(){
        return (List<Computer>) computerCrudRepository.findAll();
    }
    public Optional<Computer> getComputer(int id){
        return computerCrudRepository.findById(id);
    }
    public Computer save(Computer c){
        return computerCrudRepository.save(c);
    }
    public void delete(Computer c){
        computerCrudRepository.delete(c);
    }
}
