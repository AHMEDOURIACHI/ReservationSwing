/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.view;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author formation
 */
public class JFramePrincipale extends JFrame {

    public JFramePrincipale() {
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel paneau = new JPanel();
        JPanel chambre = new JPanel();
        
        this.add(new JpanelHotel());
        this.add(new JpanelChambre());
        
    
        this.setVisible(true);
    }

}
