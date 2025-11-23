package com.example.Proiect_Data.Controller;

import com.example.Proiect_Data.Domain.Echipa;
import com.example.Proiect_Data.Service.ServiceEchipa;

import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerEchipa {
    private final ServiceEchipa serviceEchipa;

    public ControllerEchipa(ServiceEchipa serviceEchipa)
    {
        this.serviceEchipa=serviceEchipa;
    }

    @GetMapping(path = "/echipa")
    public Iterable<Echipa> HomeEchipa()
    {

        return serviceEchipa.getAll1();
    }


    @PostMapping(path = "/echipa")
    public Echipa addEchipa(@RequestBody Echipa newEchipa)
    {

        return serviceEchipa.add_echipa(newEchipa);
    }

    @GetMapping(path = "/echipa/{id}")
    public Echipa findEchipa(@PathVariable Long id ){
        return serviceEchipa.FindById(id);

    }

    @DeleteMapping(path = "/echipa/{id}")
    public Iterable<Echipa> DeleteEchipaById(@PathVariable Long id){
         serviceEchipa.deleteEchipa(id);
         return  HomeEchipa();
    }

    @PutMapping(path = "/echipa/{id}")
    public Iterable<Echipa> UpdateEchipa(@PathVariable Long id, @RequestBody Echipa NewEchipa){
         serviceEchipa.updateEchipa(id,NewEchipa);
         return HomeEchipa();
    }




}
