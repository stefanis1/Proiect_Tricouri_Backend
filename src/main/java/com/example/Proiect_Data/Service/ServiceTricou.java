package com.example.Proiect_Data.Service;

import com.example.Proiect_Data.Domain.Tricou;
import com.example.Proiect_Data.Repository.RepoTricou;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTricou {

    @Autowired
    private RepoTricou repoTricou;


    public ServiceTricou(){
    }


    public void add_Tricou(Tricou e)
    {
        repoTricou.save(e);
    }

    public  Iterable<Tricou> getAll(){return repoTricou.findAll();}

//    public int size() {
//        return Lista.size();
//    }
}
