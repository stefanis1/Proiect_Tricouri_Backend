package com.example.Proiect_Data.Service;

import com.example.Proiect_Data.Domain.Echipa;
import com.example.Proiect_Data.Repository.RepoEchipa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service2 {

    @Autowired
    private RepoEchipa repo1;
    public  Service2(RepoEchipa repo1){
        this.repo1=repo1;
    }

    public Iterable<Echipa> getAll1(){
        return  repo1.findAll();
    }
}
