package com.example.demo.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Patients")
public class Patient{

    private long pid;
    private String firstName;
    private String lastName;
    private String Disease;
    private int did;

    public Patient() {

    }

    public Patient(String firstName, String lastName, String disease,int did) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.did = did;
        this.Disease=disease;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return pid;
    }
    public void setId(long id) {
        this.pid = id;
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

    @Column(name = "disease", nullable = false)
    public String getDisease() {
        return Disease;
    }
    public void setDisease(String disease) {
        this.Disease = disease;
    }
    
    @Column(name = "did", nullable = false)
    public int getDid() {
        return did;
    }
    public void setDid(int did) {
        this.did = did;
    }
    
    
   
}