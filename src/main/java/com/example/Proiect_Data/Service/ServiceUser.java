package com.example.Proiect_Data.Service;


import com.example.Proiect_Data.Domain.User;
import com.example.Proiect_Data.Repository.RepoUser;
import org.springframework.stereotype.Service;

@Service
public class ServiceUser {
    private final  RepoUser repoUser;

    public void add_User(User user){
        repoUser.save(user);
    }

    public ServiceUser(RepoUser repoUser) {
        this.repoUser=repoUser;

    }

    public void deleteUser(Long id){
        repoUser.deleteById(id);
    }

    public User GetByIdUser(Long id){
        return repoUser.findById(id).orElse(null);
    }

    public Iterable<User> getAll(){
        return repoUser.findAll();
    }


    public void updateUser(Long id , User newuser) {
        User OldUser=GetByIdUser(id);
        OldUser.setEmail(newuser.getEmail());
        OldUser.setName(newuser.getName());

        repoUser.save(OldUser);
    }
}
