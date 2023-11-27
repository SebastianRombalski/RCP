package com.example.RCP.ModelClass;

import jakarta.persistence.*;

@Entity
@Table(name = "groupsss")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int groupId;


    public Group(String name, int groupId) {
        this.name = name;
        this.groupId = groupId;
    }


    public Group() {
    }

    public long getID() {
        return id;
    }

    public void setID(long ID) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
