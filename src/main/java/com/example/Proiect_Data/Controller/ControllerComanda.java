package com.example.Proiect_Data.Controller;


import com.example.Proiect_Data.Domain.Comanda;
import com.example.Proiect_Data.Service.ServiceComanda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerComanda {

    private final ServiceComanda serviceComanda;

    public ControllerComanda(ServiceComanda serviceComanda){
        this.serviceComanda=serviceComanda;
    }

    @GetMapping(path = "/comanda")
    public Iterable<Comanda> ComandaHome (){
        return serviceComanda.getAll();
    }
}
