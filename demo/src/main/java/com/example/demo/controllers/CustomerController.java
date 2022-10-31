package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.entities.Customers;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping("/find-all")
    public ResponseEntity<?> getAllData(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<?> getDataById(@PathVariable Integer id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createDate(@RequestBody Customers param){
        Customers data = service.createData(param);

        if (data != null){
            return new ResponseEntity<>(data, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @PutMapping("/update")
    public ResponseEntity<?> updateData(@RequestBody Customers params, @RequestParam(name = "id") Integer id){

        Customers data = service.updateData(params, id);

        if(data != null){
            return new ResponseEntity<>(data, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteData(@PathVariable Integer id){

        if(service.deleteData(id)){
            return new ResponseEntity<>("Delete success", HttpStatus.OK);
        }
        return new ResponseEntity<>("Delete failed" ,HttpStatus.BAD_REQUEST);
    }
}
