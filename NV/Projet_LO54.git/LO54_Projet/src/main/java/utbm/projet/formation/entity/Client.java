/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utbm.projet.formation.entity;

/**
 *
 * @author Faye
 */
public class Client implements java.io.Serializable{
    
    private int id_client;
    private String lastname;
    private String firstname;
    private String address;
    private String phone;
    private String email;
    private Course_Session course_session_id;

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course_Session getCourse_session() {
        return course_session_id;
    }

    public void setCourse_session(Course_Session course_session) {
        this.course_session_id = course_session;
    }
}
