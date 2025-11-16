package com.example.Proiect_Data.Domain;

public class Detalii_Comanda extends BaseEntity {
    private int id_comanda;
    private int id_user;
    private int cantitate;

    public Detalii_Comanda(){}

    public Detalii_Comanda(int id_comanda,int id_user,int cantitate){
        this.id_comanda=id_comanda;
        this.id_user=id_user;
        this.cantitate=cantitate;
    }

    public int getId_comanda() {
        return id_comanda;
    }

    public void setId_comanda(int id_comanda) {
        this.id_comanda = id_comanda;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    @Override
    public String toString(){
        return "Detalii_Comanda:Id_Comanda: "+id_comanda+" ,Id_User "+id_user+" ,cantitate"+cantitate;
    }
}
