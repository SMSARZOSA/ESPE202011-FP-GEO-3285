/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.controller;

import ec.edu.espe.farmsystem.model.Rabbit;
import utils.FileManager;

/**
 *
 * @author Shirley
 */
public class rabbitController {
    public  void save(Rabbit rabbit){
        
        String data = rabbit.getName() + ";" + rabbit.getRace() + ";" + rabbit.getWeight() + ";" + rabbit.isIsSterelized();
        FileManager.save(data, "rabbits");   
        
    }
    public String read(){
        String data;
        data = FileManager.read("rabbits.csv");
        return data;            
                
    }
}
