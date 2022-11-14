
package com.at.ManageItBackend.Entity.Users;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "tm_user")
    private int taskUserId;

    @Column(name = "pm_user")
    private int pmoUserId;

    @Column(name = "hm_user")
    private int hotelUserId;

    @Column(name = "services")
    private ArrayList<Integer> services;

    @Column(name = "businesses")
    private ArrayList<Integer> businesses;

    @Column(name = "created_at")
    private Date created_at;

    public User(){
        super();
    }

    public User(int id, String firstName, String lastName, String email, String password, Date created_at) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.created_at = created_at;
    }

    public User(int id, String firstName, String lastName, String email, String password, int taskUserId,
                int pmoUserId, int hotelUserId, ArrayList<Integer> services, ArrayList<Integer> businesses, Date created_at) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.taskUserId = taskUserId;
        this.pmoUserId = pmoUserId;
        this.hotelUserId = hotelUserId;
        this.services = services;
        this.businesses = businesses;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTaskUserId() {
        return taskUserId;
    }

    public void setTaskUserId(int taskUserId) {
        this.taskUserId = taskUserId;
    }

    public int getPmoUserId() {
        return pmoUserId;
    }

    public void setPmoUserId(int pmoUserId) {
        this.pmoUserId = pmoUserId;
    }

    public int getHotelUserId() {
        return hotelUserId;
    }

    public void setHotelUserId(int hotelUserId) {
        this.hotelUserId = hotelUserId;
    }

    public List<Integer> getServices() {
        return services;
    }

    public void setServices(ArrayList<Integer> services) {
        this.services = services;
    }

    public List<Integer> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(ArrayList<Integer> businesses) {
        this.businesses = businesses;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", taskUserId=" + taskUserId +
                ", pmoUserId=" + pmoUserId +
                ", hotelUserId=" + hotelUserId +
                ", services=" + services +
                ", businesses=" + businesses +
                ", created_at=" + created_at +
                '}';
    }
}

