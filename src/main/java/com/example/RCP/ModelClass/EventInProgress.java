package com.example.RCP.ModelClass;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "eventsInProgress")
public class EventInProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public EventInProgress() {
    }

    public EventInProgress(Date date, User user) {
        this.date = date;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
