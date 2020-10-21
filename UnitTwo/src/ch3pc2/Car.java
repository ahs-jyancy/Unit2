/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch3pc2;

/**
 *
 * @author 992207402
 */
public class Car {
    private int yearModel;
    private String make;
    private int speed;
    private int accelerate;
    private int brake;
    
    public Car (int y, String m, int s){
        yearModel = y;
        make = m;
        speed = s;
    }
    
    public void setCar (int y){
        yearModel = y;
    }
    
    public int getCar(){
        return yearModel;
    }
    
    public void setMake(String m){
        make = m;
    }
    
    public String getMake(){
        return make;
    }
    
    public void setSpeed(int s){
        speed = s;
    }
    
    public int getSpeed(){
        return speed;
 
    }
    
    public void setAccl(int a){
        accelerate = a;        
    }
    
    public int getAccel(){
        return accelerate = speed * 5;
    }
    
    public void setBrake(int b){
        brake = b;
    }
    
    public int getBrake(){
        return brake = speed * -5;
    }
    
    
    
}

