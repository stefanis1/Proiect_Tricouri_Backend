package com.example.Proiect_Data.Repository;


import com.example.Proiect_Data.Domain.Comanda;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoComanda extends CrudRepository<Comanda,Long> {
}
