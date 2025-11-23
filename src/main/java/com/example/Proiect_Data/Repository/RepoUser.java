package com.example.Proiect_Data.Repository;


import com.example.Proiect_Data.Domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoUser extends CrudRepository<User,Long> {
}
