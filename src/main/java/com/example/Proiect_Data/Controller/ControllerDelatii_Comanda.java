package com.example.Proiect_Data.Controller;


import com.example.Proiect_Data.Domain.Detalii_Comanda;
import com.example.Proiect_Data.Service.ServiceDetalii_Comanda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDelatii_Comanda {

    private final ServiceDetalii_Comanda serviceDetalii_comanda;

    public ControllerDelatii_Comanda(ServiceDetalii_Comanda serviceDetaliiComanda){
        this.serviceDetalii_comanda=serviceDetaliiComanda;
    }

    @GetMapping(path = "detalii_comanda")
    public Iterable<Detalii_Comanda> detaliiComandaHome(){
        return serviceDetalii_comanda.getAll();
    }

}
