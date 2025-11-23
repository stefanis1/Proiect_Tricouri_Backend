package com.example.Proiect_Data.Service;

import com.example.Proiect_Data.Domain.Detalii_Comanda;
import com.example.Proiect_Data.Repository.RepoDetalii_Comanda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceDetalii_Comanda {

    private final RepoDetalii_Comanda repoDetalii_comanda;


    public ServiceDetalii_Comanda (RepoDetalii_Comanda repoDetalii_comanda){
        this.repoDetalii_comanda=repoDetalii_comanda;
    }

    public Iterable<Detalii_Comanda> getAll(){
        return repoDetalii_comanda.findAll();
    }
}
