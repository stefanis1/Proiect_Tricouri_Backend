package com.example.Proiect_Data.Repository;

import com.example.Proiect_Data.Domain.Tricou;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoTricou extends CrudRepository<Tricou,Long> {
}
