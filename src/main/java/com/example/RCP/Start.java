package com.example.RCP;


import com.example.RCP.ModelClass.Group;
import com.example.RCP.Service.ServiceDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Start {

ServiceDataBase serviceDataBase;

    @Autowired
    public Start(ServiceDataBase serviceDataBase) {
       this.serviceDataBase = serviceDataBase;

        Group group = new Group("group 1", 1);
        Group group2 = new Group("group 2", 2);
        serviceDataBase.addGroup(group);
        serviceDataBase.addGroup(group2);
        serviceDataBase.addUser("Jan", "Kowalski", 123456789, group, true);
        serviceDataBase.addUser("Andrzej", "Nowak", 123456789, group, false);

        serviceDataBase.addUser("Elzbieta", "Nowak", 123456789, group2, true);
        serviceDataBase.addUser("Patrycja", "Nowak", 123456789, group2, false);
        serviceDataBase.addUser("Anna", "Nowak", 123456789, group2, false);

    }
}
