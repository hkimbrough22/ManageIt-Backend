package com.at.ManageItBackend.Entity.Users;

import javax.persistence.*;

@Table(name = "tm_user", indexes = {
        @Index(name = "tasks", columnList = "tasks")
})
@Entity
public class TaskUser {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tasks")
    private TmTask tasks;

    public TmTask getTasks() {
        return tasks;
    }

    public void setTasks(TmTask tasks) {
        this.tasks = tasks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}