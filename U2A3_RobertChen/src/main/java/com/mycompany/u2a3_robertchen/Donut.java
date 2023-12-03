/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a3_robertchen;

/**
 *
 * @author 335091559
 */
public class Donut extends Shape{
    private double radius1;
    private double radius2;
    
    public Donut(double radius1, double radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }
    
    @Override
    public double getArea() {
        return (Math.PI * (radius2 * radius2)) - (Math.PI * (radius1 * radius1));
    }
    
    @Override
    public String toString() {
        return "Donut:" + "\nInner Radius: " + Math.round(radius1 * 100.0) / 100.0 + "m²\nOuter Radius: " + Math.round(radius2 * 100.0) / 100.0 
                + "m²\nArea: " + Math.round(getArea() * 100.0) / 100.0 + "m²";
    }
}
