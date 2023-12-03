/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a3_robertchen;

/**
 *
 * @author 335091559
 */
public class Circle extends Shape{
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    
    @Override
    public String toString() {
        return "Circle:" + "\nRadius: " + Math.round(radius * 100.0) / 100.0 + "m²\nArea: " + Math.round(getArea() * 100.0) / 100.0 + "m²";
    }
}
