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
public class Course_Session implements java.io.Serializable{
    
    private int id_course_session;
    private String start_date;
    private String end_date;
    private Location location;
    private Course course_code;

    public int getId_course_session() {
        return id_course_session;
    }

    public void setId_course_session(int id_course_session) {
        this.id_course_session = id_course_session;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Course getCourse() {
        return course_code;
    }

    public void setCourse(Course course) {
        this.course_code = course;
    }
}
