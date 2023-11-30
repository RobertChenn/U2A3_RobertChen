/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u1a3_robertchen;

/**
 *
 * @author 335091559
 */
public class Parallelogram extends Shape{
    private double base;
    private double height;
    
    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return base * height;
    }
    
    @Override
    public String toString() {
        return "Parallelogram:\n" + "ID: " + "\nBase: " + base + "\nHeight: " 
                + height + "\nArea" + getArea();
    }
}
