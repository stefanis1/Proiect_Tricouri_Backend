package com.example.Proiect_Data.Domain;

public class User extends BaseEntity {
    private String name;
    private String email;

    public User(){};

    public User(String name,String email){
        this.name=name;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "User: nume:"+name+" ,email:"+email+" ,ID:"+getId();
    }
}
