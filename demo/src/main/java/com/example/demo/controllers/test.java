package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.example.demo.models.entities.Customers;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/api/v1")
public class test {

    @Autowired
    private CustomerService service;
    
    @GetMapping
    public String greeting(){
        return "Halooo...";
    }

    @GetMapping("/find-all")
    public ResponseEntity<?> getAllData(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    //using param
    @GetMapping("/find/{id}")
    public ResponseEntity<?> getDataById(@PathVariable Integer id){
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    //using query param
     @GetMapping("/find")
    public ResponseEntity<?> getDataById(@RequestParam(name = "id") String id){
        return new ResponseEntity<>(service.findById(Integer.parseInt(id)), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> createDate(@RequestBody Customers param){
        Customers data = service.createData(param);

        if (data != null){
            return new ResponseEntity<>(data, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
