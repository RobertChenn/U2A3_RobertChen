/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a3_robertchen;

/**
 *
 * @author 335091559
 */
public class Trapezoid extends Shape{
    private double baseA;
    private double baseB;
    private double height;
    
    public Trapezoid(double baseA, double baseB, double height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return ((baseA + baseB) / 2) * height;
    }
    
    @Override
    public String toString() {
        return "Trapezoid:" + "\nBase (a): " + Math.round(baseA * 100.0) / 100.0 + "m²\nBase (b): " 
                + Math.round(baseB * 100.0) / 100.0 + "m²\nHeight: " + Math.round(height * 100.0) / 100.0 + "m²\nArea: " 
                + Math.round(getArea() * 100.0) / 100.0 + "m²";
    }
}
