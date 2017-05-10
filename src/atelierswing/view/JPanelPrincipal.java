/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.view;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author formation
 */
public class JPanelPrincipal extends javax.swing.JPanel {

    public void RemplaceCompsantCentral(JPanel nouveaupanneau) {
        // supprime pannea au centre si existe 
        BorderLayout layout = (BorderLayout) this.getLayout();
        Component component = layout.getLayoutComponent(BorderLayout.CENTER);

        if (component != null) {
            this.remove(component);

            // Ajout nouveau paneau au centre
            this.add(nouveaupanneau, BorderLayout.CENTER);
            // raffrichit l affichage de l objet actuel ( un JPanelprincipal donc et de tous ses composants enfants , petits enfants 
            this.validate();

        }

    }

    /**
     * Creates new form JPanelPrincipal
     */
    public JPanelPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        jbHotels = new javax.swing.JButton();
        jchambres = new javax.swing.JButton();
        jBClient = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jToolBar2.setRollover(true);

        jbHotels.setText("Hotels");
        jbHotels.setFocusable(false);
        jbHotels.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbHotels.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbHotels.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHotelsActionPerformed(evt);
            }
        });
        jToolBar2.add(jbHotels);

        jchambres.setText("Chambres");
        jchambres.setFocusable(false);
        jchambres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jchambres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jchambres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchambresActionPerformed(evt);
            }
        });
        jToolBar2.add(jchambres);

        jBClient.setText("Client");
        jBClient.setFocusable(false);
        jBClient.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBClient.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClientActionPerformed(evt);
            }
        });
        jToolBar2.add(jBClient);

        add(jToolBar2, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jbHotelsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHotelsActionPerformed

        this.add(new JPanelListeHotels(), BorderLayout.CENTER);
    }//GEN-LAST:event_jbHotelsActionPerformed

    private void jchambresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchambresActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jchambresActionPerformed

    private void jBClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClientActionPerformed
        this.add(new JPanelListeCleint(),BorderLayout.CENTER);
    }//GEN-LAST:event_jBClientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClient;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jbHotels;
    private javax.swing.JButton jchambres;
    // End of variables declaration//GEN-END:variables
}
