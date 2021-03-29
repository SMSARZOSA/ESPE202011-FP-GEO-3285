/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmsystem.model;

/**
 *
 * @author Shirley
 */
public class Rabbit {
    private String name;
    private String race;
    private int weight;
    private boolean isSterelized;

    public Rabbit(String name, String race, int weight, boolean isSterelized) {
        this.name = name;
        this.race = race;
        this.weight = weight;
        this.isSterelized = isSterelized;
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @return the isSterelized
     */
    public boolean isIsSterelized() {
        return isSterelized;
    }

    /**
     * @param isSterelized the isSterelized to set
     */
    public void setIsSterelized(boolean isSterelized) {
        this.isSterelized = isSterelized;
    }
    
    
}
