/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.awt.Color;

/**
 *
 * @author Owner
 ‘*  Class Name CarClass
 * Class Author Angelica Jones
 * Purpose of the class To learn and practice how to create objects, attributes, and methods.
 * Date 9/19/19
 * List of changes with dates. 9/19/17, had a for loop in both accelerate and brake methods.
 */
public class CarClass 
{
    //these are the private variables defined in the car class
    private String make;
    private String model;
    private String myColor;
    private int speed;
    
    //this is the constructor with the following variables passing.
    public CarClass(String model, String myColor, String make) 
    {
        //object "this" sets the object and plugs in the model and color
        //refers to this object of the Carclass
        
        this.myColor= myColor;
        this.model = model;
        this.make = make;
        this.speed = 0;
    
    }
    
    //this is a getter
    public String getMake()
    {
        return make;
    }
    
    //this is a setter,  it is passing the string make as a parameter
    public void setMake(String make)
    {
        this.make = make;
        
    }
    
    //this is also a getter
    public String getModel()
    {
        return model;
    }
    
    //this sets the color
    public void setModel(String model)
    {
        this.model = model;
    }
    
    //this gets the color
    //color needs to be converted into a string
    public String getColor()//this parameter is not necessary
    {
        return myColor;
    }
    
    //this is a setter that sets the color
    public void setColor(String myColor)
    {
        this.myColor = myColor;
    }
    //setting the speed to zero.
   
    public int getSpeed()
    {
       
        return speed;
    }
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
   
    
    //increases the value by 5
    public int accelerate()
    {
        speed  += 5;
        
        //if the speed goes over 200 then the acceleration will stop
        if(speed > 201)
        {
            speed = 200;
            
        }
        return speed;
        
    }
    
    //decreases the value by 5
    public int brake()
    {
        speed -=5;
        //if the speed goes below 0 then the brake will stop
        
        if(speed < 0 )
        {
            speed = 0;
            
        }
        return speed;
       //Juana suggested I use a if statement to ensure the speed doesn't become negative
    }
}
