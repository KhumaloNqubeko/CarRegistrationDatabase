/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.studentapp.studentApplication.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ABSSAGR
 */
@Entity
public class Visitor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String driverName;
    private String carType;
    private String carRegistration;
    private String reasonForVisitation;
    private String personResponsible;
    private String email;
    private String password;
    private String timeIn;
    
    @Column(nullable = true)
    private String timeOut;

    public Visitor() {
    }

    public Visitor(String driverName, String carType, String carRegistration, String reasonForVisitation, String personResponsible, String email, String password, String timeIn, String timeOut) {
        this.driverName = driverName;
        this.carType = carType;
        this.carRegistration = carRegistration;
        this.reasonForVisitation = reasonForVisitation;
        this.personResponsible = personResponsible;
        this.email = email;
        this.password = password;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }

    public Visitor(long id, String driverName, String carType, String carRegistration, String reasonForVisitation, String personResponsible, String email, String password, String timeIn, String timeOut) {
        this.id = id;
        this.driverName = driverName;
        this.carType = carType;
        this.carRegistration = carRegistration;
        this.reasonForVisitation = reasonForVisitation;
        this.personResponsible = personResponsible;
        this.email = email;
        this.password = password;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
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

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarRegistration() {
        return carRegistration;
    }

    public void setCarRegistration(String carRegistration) {
        this.carRegistration = carRegistration;
    }

    public String getReasonForVisitation() {
        return reasonForVisitation;
    }

    public void setReasonForVisitation(String reasonForVisitation) {
        this.reasonForVisitation = reasonForVisitation;
    }

    public String getPersonResponsible() {
        return personResponsible;
    }

    public void setPersonResponsible(String personResponsible) {
        this.personResponsible = personResponsible;
    }

    public String getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }

    public String getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }
    
    
}
