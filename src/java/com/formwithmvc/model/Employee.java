/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formwithmvc.model;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class Employee {
    private int id;
    private String fname;
    private String lname;
    private String email;
    private String password;
    private int hidden;

    public Employee(int Id, String Fname, String Lname, String Email, String Password) {

        this.id=Id;
        this.fname=Fname;
        this.lname=Lname;
        this.email=Email;
        this.password=Password;
        
    }

    public Employee() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the hidden
     */
    public int getHidden() {
        return hidden;
    }

    /**
     * @param hidden the hidden to set
     */
    public void setHidden(int hidden) {
        this.hidden = hidden;
    }

    /**
     * @return the hidden
     */
 

    
    
}
