package com.example.Proiect_Data.Domain;


import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public BaseEntity(){}

    public BaseEntity(Long id){this.id=id;}


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return "Entity:Id "+id;
    }
}
