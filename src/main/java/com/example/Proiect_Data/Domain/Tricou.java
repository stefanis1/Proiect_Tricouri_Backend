package com.example.Proiect_Data.Domain;


import jakarta.persistence.*;

@Entity
@Table(name="Tricou")
public class Tricou extends BaseEntity {

    @Column(name = "Model")
    private String name;

    @Column(name = "Marime")
    private String marime;

    @Column(name = "Stock")
    private int stock;


    @ManyToOne
    @JoinColumn(name = "id_echipa")
    private Echipa echipa;

    @Column(name = "Pret")
    private int pret;

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public Tricou(){}

    public void setMarime(String marime) {
        this.marime = marime;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Echipa getEchipa() {
        return echipa;
    }

    public void setEchipa(Echipa echipa) {
        this.echipa = echipa;
    }


    public String getName() {
        return name;
    }

    public String getMarime() {
        return marime;
    }

    public int getStock() {
        return stock;
    }


    public Tricou( String name, String marime, int stock, Echipa echipa,int pret){
        this.name=name;
        this.marime=marime;
        this.stock=stock;
        this.echipa=echipa;
        this.pret=pret;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Tricou="+"id, "+getId()
                +name+" nume," +
                " "+" marime"+marime+
                ", stock"+stock
                +echipa+", id_echipa";
    }
}



