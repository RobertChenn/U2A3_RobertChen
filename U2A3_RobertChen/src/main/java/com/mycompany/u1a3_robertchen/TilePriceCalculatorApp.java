/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.u1a3_robertchen;

/**
 *
 * @author 335091559
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TilePriceCalculatorApp extends javax.swing.JFrame {

    /**
     * Creates new form TilePrice
     */
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rectangle.setText("Rectangle");

        parallelogram.setText("Parallelogram");

        triangle.setText("Triangle");

        circle.setText("Circle");

        donut.setText("Donut");

        trapezoid.setText("Trapezoid");

        house.setText("House");

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

        totalArea.setEditable(false);

        totalAreaPrompt.setText("Total Area:");

        totalCost.setEditable(false);

        totalCostPrompt.setText("Total Cost:");

        dimension1Prompt.setText("Dimension 1:");

        dimension2Prompt.setText("Dimension 2:");

        dimension3Prompt.setText("Dimension 3:");

        dimension4Prompt.setText("Dimension 4:");

        pricePrompt.setText("Price per Metre Squared:");

        add.setText("Add");

        remove.setText("Remove");

        output.setEditable(false);

        clear.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dimension2Prompt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dimension2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dimension1Prompt)
                                        .addGap(18, 18, 18)
                                        .addComponent(dimension1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dimension3Prompt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dimension3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dimension4Prompt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dimension4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(remove)
                                    .addComponent(add)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pricePrompt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title)
                        .addGap(121, 121, 121)))
                .addGap(50, 50, 50))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dimension1Prompt)
                                    .addComponent(dimension1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dimension2Prompt)
                                    .addComponent(dimension2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dimension3Prompt)
                                    .addComponent(dimension3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dimension4Prompt)
                                    .addComponent(dimension4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(remove)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pricePrompt)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listSubHeading)
                            .addComponent(clear))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calculate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalAreaPrompt))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(totalCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(totalCostPrompt))
                                .addGap(47, 47, 47))))
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
    private javax.swing.JLabel title;
    private javax.swing.JTextField totalArea;
    private javax.swing.JLabel totalAreaPrompt;
    private javax.swing.JTextField totalCost;
    private javax.swing.JLabel totalCostPrompt;
    private javax.swing.JToggleButton trapezoid;
    private javax.swing.JToggleButton triangle;
    // End of variables declaration//GEN-END:variables
}
