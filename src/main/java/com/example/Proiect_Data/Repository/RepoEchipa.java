package com.example.Proiect_Data.Repository;


import com.example.Proiect_Data.Domain.Echipa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RepoEchipa extends CrudRepository<Echipa,Long> {


}
