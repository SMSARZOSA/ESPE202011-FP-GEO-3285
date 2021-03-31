/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Students.controller;

import ec.edu.espe.Students.model.studentModel;
import utils.FileManager;

/**
 *
 * @author Shirley
 */
public class studentController {
    public  void save(studentModel student){
        
        String data = student.getName() + ";" + student.getId()+ ";" + student.getAverage()+ ";" + student.getDirection()+ " ;" + student.getAge();
        FileManager.save(data, "students");   
        
    }
    public String read(){
        String data;
        data = FileManager.read("students.csv");
        return data;            
                
    }
}

