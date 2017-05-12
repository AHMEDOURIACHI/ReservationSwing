/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.view;

import atelierswing.entity.Chambre;
import atelierswing.services.ChambreService;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author formation
 */
public class ComboBoxModelChambre extends DefaultComboBoxModel<String>{
    List<Chambre> chambres;

    public ComboBoxModelChambre() {
        ChambreService chmbrsrvce = new ChambreService();
        this.chambres=chmbrsrvce.lister();
        }

    public List<Chambre> getChambres() {
        return chambres;
    }

    
    
    
    @Override
    public String getElementAt(int index) {
        return Long.toString(this.chambres.get(index).getId());
    }

    @Override
    public int getSize() {
        return this.chambres.size();
    }
    
    
}
