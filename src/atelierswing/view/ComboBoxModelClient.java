/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atelierswing.view;

import atelierswing.entity.Client;
import atelierswing.services.ClientService;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author formation
 */
public class ComboBoxModelClient extends DefaultComboBoxModel<String> {
    
    private List<Client> clients;

    public ComboBoxModelClient() {
        ClientService ctsrvce = new ClientService();
        clients=ctsrvce.ListerClient();
    }

    @Override
    public String getElementAt(int index) {
        return this.clients.get(index).getNom();
    }

    @Override
    public int getSize() {
        return this.clients.size();
    }
    
    
}
