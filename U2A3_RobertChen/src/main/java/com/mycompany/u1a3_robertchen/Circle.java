/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u1a3_robertchen;

/**
 *
 * @author 335091559
 */
public class Circle extends Shape{
    private double radius;
    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    
    @Override
    public String toString() {
        return "Circle:\n" + "ID: " + "\nRadius: " + radius + "\nArea: " + getArea();
    }
}
