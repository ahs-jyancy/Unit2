/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RetailItem;

/**
 *
 * @author 992207402
 */
public class RetailItem {
    private String desc;
    private int units;
    private double price;
    
    public RetailItem(String d, int u, double p){
        desc = d;
        units = u;
        price = p;
    }
    
    public void setDesc(String d){
        desc = d;
    }
    
    public String getDesc(){
        return desc;
    }
    
    public void setUnits (int u){
        units = u;
    }
    
    public int getUnits(){
        return units;
    }
    
    public void setPrice(double p){
        price = p;
    }
    
    public double getPrice(){
        return price;
    }
}
