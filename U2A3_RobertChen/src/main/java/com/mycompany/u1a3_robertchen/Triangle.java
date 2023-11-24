/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u1a3_robertchen;

/**
 *
 * @author 335091559
 */
public class Triangle extends Shape{
    private double base;
    private double height;
    
    @Override
    public double getArea() {
        return (base * height) / 2;
    }
    
    @Override
    public String toString() {
        return "Triangle:\n" + "ID: " + "\nBase: " + base + "\nHeight: " 
                + height + "\nArea" + getArea();
    }
}
