/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u1a3_robertchen;

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
        return "Rectangle:\n" + "ID: " + "\nLength: " + length + "\nWidth: " 
                + width + "\nArea" + getArea();
    }
}
