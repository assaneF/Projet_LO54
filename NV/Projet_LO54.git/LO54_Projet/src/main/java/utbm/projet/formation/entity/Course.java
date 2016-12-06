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
public class Course implements java.io.Serializable{
    
    private String code;
    private String title;
    
    public Course()
    {
        
    }
    
    public Course(String Code, String Title)
    {
        this.code = Code;
        this.title = Title;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setCode(String Code) {
        this.code = Code;
    }
    
    public void setTitle(String Title) {
        this.title = Title;
    }
}
