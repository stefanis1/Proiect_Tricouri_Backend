package com.example.Proiect_Data.Domain;



public class Comanda extends BaseEntity {
    private java.time.LocalDate data;
    private int id_user;


    Comanda(){}

    Comanda(int id_user,java.time.LocalDate data )
    {
        this.id_user=id_user;
        this.data=data;
    }

    public java.time.LocalDate getData() {
        return data;
    }

    public void setData(java.time.LocalDate data) {
        this.data = data;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString(){
        return "Comanda:ID"+getId()+" ,Id_User "+id_user+" ,data:"+data;
    }


}
