/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.view;

import atelierswing.entity.Client;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author formation
 */
public class TableModelCleint  extends AbstractTableModel{
    
    
    private List<Client>  clients;
    

    public TableModelCleint() {
    }

    public TableModelCleint(List<Client> clients) {
        this.clients = clients;
    }
    
    
    
    

    @Override
    public int getRowCount() {
        
        return clients.size();
        
    }

    @Override
    public int getColumnCount() {
         
    return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Client client =  clients.get(rowIndex);
        
          if (columnIndex==0)
           return  client.getId();
          
          if (columnIndex==1)
            return  client.getNom();
          
          if(columnIndex==2)
              
          return client.getPrenom();
         
           return new RuntimeException("indice de colone incorrect");
        
    }
    
}
