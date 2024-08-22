/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Repository.InvitationRepository;
import java.util.List;
import model.Invitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pablo
 */
@Service
public class InvitationService implements InterfaceInvitation {

    
    @Autowired
    private InvitationRepository invitationR;
    
    @Override
    public List<Invitation> getAllInvitation() {
        return invitationR.findAll();
    }

    @Override
    public List<Invitation> getAllCancel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void saveInvitation(Invitation invitation) {
         invitationR.save(invitation);
    }

    @Override
    public void cancelInvitation(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
