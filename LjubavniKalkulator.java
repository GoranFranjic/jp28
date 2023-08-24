/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova;

/**
 *
 * @author goran
 */

import java.util.Arrays;

public class LjubavniKalkulator extends javax.swing.JFrame {

    public LjubavniKalkulator() {
        initComponents();
    }

    private void initComponents() {
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Izračunaj ljubavni postotak");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String ime1 = jTextField1.getText();
        String ime2 = jTextField2.getText();

        String s = ime1.toLowerCase() + ime2.toLowerCase();

        int[] niz = new int[ime1.length() + ime2.length()];

        int b;
        char z;
        for (int i = 0; i < s.length(); i++) {
            z = s.charAt(i);
            b = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == z) {
                    b++;
                }
            }
            niz[i] = b;
        }

        int[] nizDva = Arrays.copyOf(niz, niz.length);
        int duljina = nizDva.length;
        StringBuilder nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
            nizTri.append(nizDva[i] + nizDva[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
            nizTri.append(nizDva[duljina / 2]);
        }

        int[] novoNiz = new int[nizTri.length()];
        for (int i = 0; i < nizTri.length(); i++) {
            novoNiz[i] = Character.getNumericValue(nizTri.charAt(i));
        }

        duljina = novoNiz.length;
        nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
            nizTri.append(novoNiz[i] + novoNiz[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
            nizTri.append(novoNiz[duljina / 2]);
        }

        //System.out.println("Rezultat je: " + nizTri);

        int[] zadnjiNiz = new int[nizTri.length()];
        for (int i = 0; i < nizTri.length(); i++) {
            zadnjiNiz[i] = Character.getNumericValue(nizTri.charAt(i));
        }

        duljina = zadnjiNiz.length;
        nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
            nizTri.append(zadnjiNiz[i] + zadnjiNiz[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
            nizTri.append(zadnjiNiz[duljina / 2]);
        }

        int[] zadnjiNiz2 = new int[nizTri.length()];
        for (int i = 0; i < nizTri.length(); i++) {
            zadnjiNiz2[i] = Character.getNumericValue(nizTri.charAt(i));
        }

        duljina = zadnjiNiz2.length;
        nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
            nizTri.append(zadnjiNiz2[i] + zadnjiNiz2[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
            nizTri.append(zadnjiNiz2[duljina / 2]);
        }

        //System.out.println("Rezultat zadnje petlje je: " + nizTri);

        int[] zadnjiNiz3 = new int[nizTri.length()];
        for (int i = 0; i < nizTri.length(); i++) {
            zadnjiNiz3[i] = Character.getNumericValue(nizTri.charAt(i));
        }

        duljina = zadnjiNiz3.length;
        nizTri = new StringBuilder();

        for (int i = 0; i < duljina / 2; i++) {
            nizTri.append(zadnjiNiz3[i] + zadnjiNiz3[duljina - 1 - i]);
        }

        if (duljina % 2 != 0) {
            nizTri.append(zadnjiNiz3[duljina / 2]);
        }
        
        
        jTextField3.setText(nizTri.toString());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LjubavniKalkulator().setVisible(true);
            }
        });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
}
