package com.example.RCP.ModelClass;


import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private int EAN;
    private boolean adminOfGroup;

    @ManyToOne
    @JoinColumn(name="group_id")
    private Group group;

    public User(String name, String surname, int EAN,Group group, boolean adminOfGroup) {
        this.name = name;
        this.surname = surname;
        this.EAN = EAN;
        this.group=group;
        this.adminOfGroup = adminOfGroup;
    }


    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getEAN() {
        return EAN;
    }

    public void setEAN(int EAN) {
        this.EAN = EAN;
    }


    public Group getGroup() {return group;}

    public void setGroup(Group group) {this.group = group;}

    public boolean isAdminOfGroup() {return adminOfGroup;}

    public void setAdminOfGroup(boolean adminOfGroup) {this.adminOfGroup = adminOfGroup;}
}
