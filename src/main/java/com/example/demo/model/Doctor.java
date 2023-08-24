package com.example.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor{

    private long did;
    private String firstName;
    private String lastName;
    private String emailId;
    private String specialization;

    public Doctor() {

    }

    public Doctor(String firstName, String lastName, String emailId,String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.specialization=specialization;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return did;
    }
    public void setId(long id) {
        this.did = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "specilaztion", nullable = false)
    public String getSpecialization() {
        return emailId;
    }
    public void setSpecialization(String emailId) {
        this.emailId = emailId;
    }
    
   
}