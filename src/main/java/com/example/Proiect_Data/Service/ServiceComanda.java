package com.example.Proiect_Data.Service;


import com.example.Proiect_Data.Domain.Comanda;
import com.example.Proiect_Data.Repository.RepoComanda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceComanda {


    private final RepoComanda repoComanda;

    public ServiceComanda(RepoComanda repoComanda){
        this.repoComanda=repoComanda;
    }

    public Iterable<Comanda> getAll(){return repoComanda.findAll();}

}
