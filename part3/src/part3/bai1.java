/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3;

/**
 *
 * @author DELL
 *
   

public class person {
    private String name;
   private double weight; 
   private String struct;
           
    public person(){
        
    }

    public person(String name, double weight, String struct ) {
        this.name = name;
        this.struct = struct;
        this.weight = weight;
    }

    public person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getStruct() {
        return struct;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStruct(String struct) {
        this.struct = struct;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        if (weight <= 0) this.weight = 0;  
    }
    public void display(){
        System.out.println(name+ "," + weight+ "," +struct);
    }
}

    
}
