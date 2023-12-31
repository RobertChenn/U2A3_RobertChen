package com.mycompany.u2a3_robertchen;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
/*
package com.mycompany.u1a3_robertchen;

/**
 *
 * @author 335091559
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class TilePriceCalculatorApp extends javax.swing.JFrame {

    /**
     * Creates new form TilePrice
     */
    String dimension1Input, dimension2Input, dimension3Input, dimension4Input, priceInput, string, selected, removeID;
    double dimensionO, dimensionTw, dimensionTh, dimensionF, priceI, tArea = 0, tCost = 0;
    int id = 0, deleteId, deleteID;
    ArrayList<String> shapes = new ArrayList<>();
    ArrayList<Integer> ids = new ArrayList<>();
    ArrayList<Double> areas = new ArrayList<>();
    
    public TilePriceCalculatorApp() {
        initComponents();
        ButtonGroup group = new ButtonGroup();
        group.add(rectangle);
        group.add(parallelogram);
        group.add(triangle);
        group.add(circle);
        group.add(donut);
        group.add(trapezoid);
        group.add(house);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        rectangle = new javax.swing.JToggleButton();
        parallelogram = new javax.swing.JToggleButton();
        triangle = new javax.swing.JToggleButton();
        circle = new javax.swing.JToggleButton();
        donut = new javax.swing.JToggleButton();
        trapezoid = new javax.swing.JToggleButton();
        house = new javax.swing.JToggleButton();
        title = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTextArea();
        listSubHeading = new javax.swing.JLabel();
        calculate = new javax.swing.JButton();
        totalArea = new javax.swing.JTextField();
        totalAreaPrompt = new javax.swing.JLabel();
        totalCost = new javax.swing.JTextField();
        totalCostPrompt = new javax.swing.JLabel();
        dimension1Prompt = new javax.swing.JLabel();
        dimension2Prompt = new javax.swing.JLabel();
        dimension3Prompt = new javax.swing.JLabel();
        dimension4Prompt = new javax.swing.JLabel();
        pricePrompt = new javax.swing.JLabel();
        dimension1 = new javax.swing.JTextField();
        dimension2 = new javax.swing.JTextField();
        dimension3 = new javax.swing.JTextField();
        dimension4 = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        output = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        removeId = new javax.swing.JTextField();
        removeIdPrompt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rectangle.setText("Rectangle");
        rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangleActionPerformed(evt);
            }
        });

        parallelogram.setText("Parallelogram");
        parallelogram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parallelogramActionPerformed(evt);
            }
        });

        triangle.setText("Triangle");
        triangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triangleActionPerformed(evt);
            }
        });

        circle.setText("Circle");
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });

        donut.setText("Donut");
        donut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donutActionPerformed(evt);
            }
        });

        trapezoid.setText("Trapezoid");
        trapezoid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trapezoidActionPerformed(evt);
            }
        });

        house.setText("House");
        house.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                houseActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 204, 0));
        title.setText("Tile Price Calculator");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        list.setEditable(false);
        list.setColumns(20);
        list.setRows(5);
        jScrollPane1.setViewportView(list);

        listSubHeading.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        listSubHeading.setText("Tiles in the Floor");

        calculate.setText("Calculate");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        totalArea.setEditable(false);

        totalAreaPrompt.setText("Total Area:");

        totalCost.setEditable(false);
        totalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalCostActionPerformed(evt);
            }
        });

        totalCostPrompt.setText("Total Cost:");

        dimension1Prompt.setText("Dimension 1:");

        dimension2Prompt.setText("Dimension 2:");

        dimension3Prompt.setText("Dimension 3:");

        dimension4Prompt.setText("Dimension 4:");

        pricePrompt.setText("Price (m²):");

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        output.setEditable(false);

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        removeIdPrompt.setText("Id to Remove Shape:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rectangle)
                    .addComponent(trapezoid)
                    .addComponent(parallelogram)
                    .addComponent(circle)
                    .addComponent(donut)
                    .addComponent(triangle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(house, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pricePrompt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeIdPrompt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(remove))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dimension2Prompt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dimension2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dimension1Prompt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dimension1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dimension3Prompt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dimension3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dimension4Prompt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dimension4)))
                                .addGap(58, 58, 58)
                                .addComponent(add)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(171, 171, 171))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listSubHeading)
                        .addGap(18, 18, 18)
                        .addComponent(clear)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalAreaPrompt)
                            .addComponent(totalCostPrompt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalCost)
                            .addComponent(totalArea, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculate)
                        .addGap(65, 65, 65))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(title)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dimension1Prompt)
                            .addComponent(dimension1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dimension2Prompt)
                            .addComponent(dimension2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dimension3Prompt)
                                    .addComponent(dimension3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(add)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dimension4Prompt)
                            .addComponent(dimension4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pricePrompt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeIdPrompt)
                            .addComponent(removeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remove))
                        .addGap(18, 18, 18)
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listSubHeading)
                            .addComponent(clear))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calculate)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalAreaPrompt)
                                    .addComponent(totalArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalCostPrompt)
                                    .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(rectangle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(parallelogram)
                        .addGap(18, 18, 18)
                        .addComponent(triangle)
                        .addGap(18, 18, 18)
                        .addComponent(circle)
                        .addGap(18, 18, 18)
                        .addComponent(donut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(trapezoid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(house)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangleActionPerformed
        dimension1Prompt.setText("Length:");
        dimension2Prompt.setText("Width:");
        dimension3Prompt.setText("N/A");
        dimension4Prompt.setText("N/A");
        dimension3.setText("");
        dimension4.setText("");
        dimension1.setEnabled(true);
        dimension2.setEnabled(true);
        dimension3.setEnabled(false);
        dimension4.setEnabled(false);
        selected = "rectangle";
    }//GEN-LAST:event_rectangleActionPerformed

    private void parallelogramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parallelogramActionPerformed
        dimension1Prompt.setText("Base:");
        dimension2Prompt.setText("Height:");
        dimension3Prompt.setText("N/A");
        dimension4Prompt.setText("N/A");
        dimension3.setText("");
        dimension4.setText("");
        dimension1.setEnabled(true);
        dimension2.setEnabled(true);
        dimension3.setEnabled(false);
        dimension4.setEnabled(false);
        selected = "parallelogram";
    }//GEN-LAST:event_parallelogramActionPerformed

    private void triangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triangleActionPerformed
        dimension1Prompt.setText("Base:");
        dimension2Prompt.setText("Height:");
        dimension3Prompt.setText("N/A");
        dimension4Prompt.setText("N/A");
        dimension3.setText("");
        dimension4.setText("");
        dimension1.setEnabled(true);
        dimension2.setEnabled(true);
        dimension3.setEnabled(false);
        dimension4.setEnabled(false);
        selected = "triangle";
    }//GEN-LAST:event_triangleActionPerformed

    private void circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleActionPerformed
        dimension1Prompt.setText("Radius:");
        dimension2Prompt.setText("N/A");
        dimension3Prompt.setText("N/A");
        dimension4Prompt.setText("N/A");
        dimension2.setText("");
        dimension3.setText("");
        dimension4.setText("");
        dimension1.setEnabled(true);
        dimension2.setEnabled(false);
        dimension3.setEnabled(false);
        dimension4.setEnabled(false);
        selected = "circle";
    }//GEN-LAST:event_circleActionPerformed

    private void donutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donutActionPerformed
        dimension1Prompt.setText("Radius of Inner Circle:");
        dimension2Prompt.setText("Radius of Outer Circle:");
        dimension3Prompt.setText("N/A");
        dimension4Prompt.setText("N/A");
        dimension3.setText("");
        dimension4.setText("");
        dimension1.setEnabled(true);
        dimension2.setEnabled(true);
        dimension3.setEnabled(false);
        dimension4.setEnabled(false);
        selected = "donut";
    }//GEN-LAST:event_donutActionPerformed

    private void trapezoidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trapezoidActionPerformed
        dimension1Prompt.setText("Base (a):");
        dimension2Prompt.setText("Base (b):");
        dimension3Prompt.setText("Height:");
        dimension4Prompt.setText("N/A");
        dimension4.setText("");
        dimension1.setEnabled(true);
        dimension2.setEnabled(true);
        dimension3.setEnabled(true);
        dimension4.setEnabled(false);
        selected = "trapezoid";
    }//GEN-LAST:event_trapezoidActionPerformed

    private void houseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_houseActionPerformed
        dimension1Prompt.setText("Base of Roof:");
        dimension2Prompt.setText("Height of Roof:");
        dimension3Prompt.setText("Length of House");
        dimension4Prompt.setText("Width of House");
        dimension1.setEnabled(true);
        dimension2.setEnabled(true);
        dimension3.setEnabled(true);
        dimension4.setEnabled(true);
        selected = "house";
    }//GEN-LAST:event_houseActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        Shape shape = null;
        checkEmpty();
        if (checkEmpty()) {
            price.setEnabled(false);
            if (selected.equals("rectangle")) {
                shape = new Rectangle(dimensionO, dimensionTw);
            } else if (selected.equals("parallelogram")) {
                shape = new Parallelogram(dimensionO, dimensionTw);
            } else if (selected.equals("triangle")) {
                shape = new Triangle(dimensionO, dimensionTw);
            } else if (selected.equals("circle")) {
                shape = new Circle(dimensionO);
            } else if (selected.equals("donut")) {
                if (dimensionTw > dimensionO) {
                    shape = new Donut(dimensionO, dimensionTw);
                } else {
                    output.setText("Inner radius cannot be greater than outer radius");
                }
            } else if (selected.equals("trapezoid")) {
                shape = new Trapezoid(dimensionO, dimensionTw, dimensionTh);
            } else if (selected.equals("house")) {
                shape = new House(dimensionO, dimensionTw, dimensionTh, dimensionF);
            }
            
            if (shape != null) {
                id ++;
                tArea += shape.getArea();
                areas.add(shape.getArea());
                addTo(id, shape);
            } 
        } else {
            output.setText("Invalid input. Please make sure you have filled out all required fields with the correct information and chose a shape");
        }
    }//GEN-LAST:event_addActionPerformed

    private void totalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalCostActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        removeID = removeId.getText();
        output.setText("");
        
        try {
            deleteId = Integer.parseInt(removeID);
            deleteID = -1;
            
            for (int i = 0; i < ids.size(); i++) {
                if (ids.get(i) == deleteId) {
                    deleteID = i;
                    break;
                }
            }
            
            if (deleteID != -1) {
                removeId.setText("");
                shapes.remove(deleteID);
                tArea -= areas.get(deleteID);
                areas.remove(deleteID);
                ids.remove(deleteID);
                list.setText("");
                id = ids.size();
                
                for (int x = 0; x < shapes.size(); x++) {
                    list.append(shapes.get(x) + "\n\n");
                }
            } else {
                output.setText("Invalid input. Please enter a valid Id");
            }
        } catch (Exception e) {
            output.setText("Invalid input. Please enter a valid Id");
        }
    }//GEN-LAST:event_removeActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        shapes.clear();
        areas.clear();
        ids.clear();
        list.setText("");
        id = 1;
    }//GEN-LAST:event_clearActionPerformed

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        for (int i = 0; i < shapes.size(); i++) {
            tArea += areas.get(i);
            tCost = tArea * priceI;
        }
        totalArea.setText(Double.toString(Math.round(tArea * 100.0) / 100.0) + "m²");
        totalCost.setText("$" + Double.toString(Math.round(tCost * 100.0) / 100.0));
    }//GEN-LAST:event_calculateActionPerformed
    // Checks that the user entered everything correctly
    public boolean checkEmpty() {
        dimension1Input = dimension1.getText();
        dimension2Input = dimension2.getText();
        dimension3Input = dimension3.getText();
        dimension4Input = dimension4.getText();
        priceInput = price.getText();
        try {
            priceI = Double.parseDouble(priceInput);
            
            if (priceI <= 0) {
                return false;
            }
            if (selected.equals("rectangle")) {
                dimensionO = Double.parseDouble(dimension1Input);
                dimensionTw = Double.parseDouble(dimension2Input);
                if (dimensionO <= 0 || dimensionTw <= 0) {
                    return false;
                }
            } else if (selected.equals("parallelogram")) {
                dimensionO = Double.parseDouble(dimension1Input);
                dimensionTw = Double.parseDouble(dimension2Input);
                if (dimensionO <= 0 || dimensionTw <= 0) {
                    return false;
                }
            } else if (selected.equals("triangle")) {
                dimensionO = Double.parseDouble(dimension1Input);
                dimensionTw = Double.parseDouble(dimension2Input);
                if (dimensionO <= 0 || dimensionTw <= 0) {
                    return false;
                }
            } else if (selected.equals("circle")) {
                dimensionO = Double.parseDouble(dimension1Input);
                if (dimensionO <= 0) {
                    return false;
                }
            } else if (selected.equals("donut")) {
                dimensionO = Double.parseDouble(dimension1Input);
                dimensionTw = Double.parseDouble(dimension2Input);
                if (dimensionO <= 0 || dimensionTw <= 0) {
                    return false;
                }
            } else if (selected.equals("trapezoid")) {
                dimensionO = Double.parseDouble(dimension1Input);
                dimensionTw = Double.parseDouble(dimension2Input);
                dimensionTh = Double.parseDouble(dimension3Input);
                if (dimensionO <= 0 || dimensionTw <= 0 || dimensionTh <= 0) {
                    return false;
                }
            } else if (selected.equals("house")) {
                dimensionO = Double.parseDouble(dimension1Input);
                dimensionTw = Double.parseDouble(dimension2Input);
                dimensionTh = Double.parseDouble(dimension3Input);
                dimensionF = Double.parseDouble(dimension4Input);
                if (dimensionO <= 0 || dimensionTw <= 0 || dimensionTh <= 0 || dimensionF <= 0) {
                    return false;
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    // Adds variables to their ArrayList and prints out the list of shapes
    public void addTo(int id, Shape shape) {
        string = shape.toString();
        ids.add(id);
        shapes.add(string + "\nID: " + id);
        list.append(string + "\nID: " + id + "\n\n");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TilePriceCalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TilePriceCalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TilePriceCalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TilePriceCalculatorApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TilePriceCalculatorApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton calculate;
    private javax.swing.JToggleButton circle;
    private javax.swing.JButton clear;
    private javax.swing.JTextField dimension1;
    private javax.swing.JLabel dimension1Prompt;
    private javax.swing.JTextField dimension2;
    private javax.swing.JLabel dimension2Prompt;
    private javax.swing.JTextField dimension3;
    private javax.swing.JLabel dimension3Prompt;
    private javax.swing.JTextField dimension4;
    private javax.swing.JLabel dimension4Prompt;
    private javax.swing.JToggleButton donut;
    private javax.swing.JToggleButton house;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea list;
    private javax.swing.JLabel listSubHeading;
    private javax.swing.JTextField output;
    private javax.swing.JToggleButton parallelogram;
    private javax.swing.JTextField price;
    private javax.swing.JLabel pricePrompt;
    private javax.swing.JToggleButton rectangle;
    private javax.swing.JButton remove;
    private javax.swing.JTextField removeId;
    private javax.swing.JLabel removeIdPrompt;
    private javax.swing.JLabel title;
    private javax.swing.JTextField totalArea;
    private javax.swing.JLabel totalAreaPrompt;
    private javax.swing.JTextField totalCost;
    private javax.swing.JLabel totalCostPrompt;
    private javax.swing.JToggleButton trapezoid;
    private javax.swing.JToggleButton triangle;
    // End of variables declaration//GEN-END:variables
}
