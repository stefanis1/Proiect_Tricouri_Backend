package com.example.Proiect_Data.Repository;


import com.example.Proiect_Data.Domain.Detalii_Comanda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoDetalii_Comanda extends CrudRepository<Detalii_Comanda,Long> {

}
