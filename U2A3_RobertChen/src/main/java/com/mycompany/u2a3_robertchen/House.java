/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a3_robertchen;

/**
 *
 * @author 335091559
 */
public class House extends Shape{
    private double base;
    private double height;
    private double length;
    private double width;
    
    public House(double base, double height, double length, double width) {
        this.base = base;
        this.height = height;
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return ((base * height) / 2) + (length * width);
    }
    
    @Override
    public String toString() {
        return "House:" + "\nRoof Base: " + Math.round(base * 100.0) / 100.0 + "m²\nRoof Height: " 
                + Math.round(height * 100.0) / 100.0 + "m²\nBuilding Width: " + Math.round(width * 100.0) / 100.0 + "m²\nArea: " 
                + Math.round(getArea() * 100.0) / 100.0 + "m²";
    }
}
