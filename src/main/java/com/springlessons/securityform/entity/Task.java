package com.springlessons.securityform.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue
    private long id;

    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Task() {}

    public Task(String title,
                LocalDateTime startDate, LocalDateTime endDate,
                ApplicationUser author, ApplicationUser responsibleUser) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.author = author;
        this.responsibleUser = responsibleUser;
    }

    public ApplicationUser getAuthor() {
        return author;
    }

    public void setAuthor(ApplicationUser author) {
        this.author = author;
    }

    @OneToOne
    @JoinColumn(name = "author_id")
    private ApplicationUser author;

    @OneToOne
    @JoinColumn(name = "responsible_user_id")
    private ApplicationUser responsibleUser;

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public ApplicationUser getResponsibleUser() {
        return responsibleUser;
    }

    public void setResponsibleUser(ApplicationUser responsibleUser) {
        this.responsibleUser = responsibleUser;
    }

}
