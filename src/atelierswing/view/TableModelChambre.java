/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.view;

import atelierswing.entity.Chambre;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author formation
 */
public class TableModelChambre extends AbstractTableModel{

    private List<Chambre> chambres = new ArrayList<>();

    public TableModelChambre() {
    }
    
    public TableModelChambre(List<Chambre> chambres) {
        this.chambres=chambres;
    }

    @Override
    public int getRowCount() {
        return this.chambres.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Chambre chambre = chambres.get(rowIndex);
        if(columnIndex==0){
            return chambre.getId();
        }
        if(columnIndex==1){
            return chambre.getNom();
        }
        if(columnIndex==2){
            return chambre.getPrix();
        }
        if(columnIndex==3){
            if( chambre.getHotel()==null )
                return "";
            
            return chambre.getHotel().getNom();
        }
        
        return new RuntimeException("indice de colonne incorrect");
    }
    
    
    
    
    
}
