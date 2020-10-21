/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 * Jon Yancy
 * Purpose : Define a Car
 * 
 */
public class Car {
    private String make;
    private boolean isSports;
    private String owner;
    
    /*
    no-arg constructor for the car class
    */
    public Car(){
        make = null;
        isSports = false;
        owner = null;
        
    }
    
    public Car(String m, boolean s, String o){
        make = m;
        isSports = s;
        owner = o;
        
    }
    
    public Car(String m, boolean s){
        make = m;
        isSports = s;
        owner = null;
        
    }
    
    public void printMake(){
        System.out.println(make);
        
    }
    public void printIsSports(){
        System.out.println(isSports);
        
    }
    public void printOwner(){
        System.out.println(owner);
        
    }
    
    
    
    
    
    
    
    
}
