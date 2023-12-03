/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a3_robertchen;

/**
 *
 * @author 335091559
 */
public class Rectangle extends Shape{
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public String toString() {
        return "Rectangle:" + "\nLength: " + Math.round(length * 100.0) / 100.0 + "m²\nWidth: " + Math.round(width * 100.0) / 100.0 
                + "m²\nArea: " + Math.round(getArea() * 100.0) / 100.0 + "m²";
    }
}
