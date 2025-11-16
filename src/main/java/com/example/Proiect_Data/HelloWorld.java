package com.example.Proiect_Data;

import com.example.Proiect_Data.Domain.Echipa;
import com.example.Proiect_Data.Domain.Tricou;
import com.example.Proiect_Data.Repository.RepoTricou;
import com.example.Proiect_Data.Service.Service2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld {

    @Autowired
    Service2 serv2;

    @Autowired
    RepoTricou repo;



    @GetMapping(path ="/api")
    public  String Hello(){
        return "Hello World!";
    }

    @GetMapping(path = "/api/lista")
    public Iterable<Tricou> Lista(){

        return repo.findAll();
    }

    @GetMapping(path = "/api/echipa")
    public Iterable<Echipa> echipas(){
        return serv2.getAll1();
    }



}
