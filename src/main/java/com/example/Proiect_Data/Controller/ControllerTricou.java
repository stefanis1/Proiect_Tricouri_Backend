package com.example.Proiect_Data.Controller;


import com.example.Proiect_Data.Domain.Tricou;
import com.example.Proiect_Data.Service.ServiceEchipa;
import com.example.Proiect_Data.Service.ServiceTricou;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerTricou {

    private final ServiceTricou serviceTricou;

    public ControllerTricou(ServiceTricou serviceTricou){
        this.serviceTricou=serviceTricou;
    }

    @GetMapping(path = "tricou")
    public Iterable<Tricou> HomeTricou(){
        return serviceTricou.getAll();
    }

    @DeleteMapping(path = "/tricou/{id}")
    public Iterable<Tricou> deleteTricou(@PathVariable Long id) {
        serviceTricou.deleteTricou(id);
        return HomeTricou();

    }

    @PutMapping(path = "/tricou/{id}")
    public Iterable<Tricou> updateTricou(@PathVariable Long id, @RequestBody Tricou newtricou){
        serviceTricou.updateTricou(id,newtricou);

        return HomeTricou();
    }



}
