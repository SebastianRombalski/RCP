package com.example.RCP.Service;

import com.example.RCP.ModelClass.Event;
import com.example.RCP.ModelClass.EventInProgress;
import com.example.RCP.ModelClass.Group;
import com.example.RCP.ModelClass.User;
import com.example.RCP.RepoClass.EventInProgressRepo;
import com.example.RCP.RepoClass.EventRepo;
import com.example.RCP.RepoClass.GroupRepo;
import com.example.RCP.RepoClass.UserRepo;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ServiceDataBase {
    private EventInProgressRepo eventInProgressRepo;
    private EventRepo eventRepo;
    private GroupRepo groupRepo;
    private UserRepo userRepo;

    public ServiceDataBase(EventInProgressRepo eventInProgressRepo, EventRepo eventRepo, GroupRepo groupRepo, UserRepo userRepo) {
        this.eventInProgressRepo = eventInProgressRepo;
        this.eventRepo = eventRepo;
        this.groupRepo = groupRepo;
        this.userRepo = userRepo;

    }

    public void addGroup(String name, int groupId){
        Group group = new Group(name, groupId);
        groupRepo.save(group);
    }

    public void addGroup(Group group){
        groupRepo.save(group);
    }

    public void addUser(String name, String surname, int EAN, Group group, boolean adminOfGroup) {
        User user = new User(name, surname, EAN, group, adminOfGroup);
        userRepo.save(user);
    }

    public void addEventInProgress(Date date, User user){
        EventInProgress eventInProgress = new EventInProgress(date, user);
        eventInProgressRepo.save(eventInProgress);
    }
    public void addEvent(Date dateStart, Date dateStop, User user){
        Event event = new Event(dateStart, dateStop, user);
        eventRepo.save(event);
    }


}
