package com.example.RCP;

import com.example.RCP.ModelClass.User;
import com.example.RCP.RepoClass.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Start {


    @Autowired
    public Start(UserRepo userRepo) {
        User user = new User("Sebastian", "Rombalski", 123231, 13);

        userRepo.save(user);

    }

}
