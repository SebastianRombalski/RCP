package com.example.RCP;


import com.example.RCP.ModelClass.Group;
import com.example.RCP.ModelClass.User;
import com.example.RCP.Service.ServiceDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.Delayed;


@Component
public class Start {

ServiceDataBase serviceDataBase;

    @Autowired
    public Start(ServiceDataBase serviceDataBase) {
       this.serviceDataBase = serviceDataBase;

        Group group = new Group("group 1");
        Group group2 = new Group("group 2");
        User user = new User("Jan", "Kowalski", 123456789, group, true);
        User user2  = new User("Andrzej", "Nowak", 123456789, group, false);
        User user3 = new User("Elzbieta", "Nowak", 123456789, group2, true);
        User user4 = new User("Patrycja", "Nowak", 123456789, group2, false);
        User user5 = new User("Anna", "Nowak", 123456789, group2, false);

        serviceDataBase.addGroup(group);
        serviceDataBase.addGroup(group2);
        serviceDataBase.addUser(user);
        serviceDataBase.addUser(user2);
        serviceDataBase.addUser(user3);
        serviceDataBase.addUser(user4);
        serviceDataBase.addUser(user5);


        serviceDataBase.addEventInProgress(new Date(), user);
        serviceDataBase.addEventInProgress(new Date(), user);
        serviceDataBase.addEventInProgress(new Date(), user2);
        serviceDataBase.addEventInProgress(new Date(), user3);

        serviceDataBase.addEvent(new Date(), new Date(), user5);

    }
}
