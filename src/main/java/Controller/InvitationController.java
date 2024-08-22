/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Service.InvitationService;
import java.util.List;
import model.Invitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author pablo
 */
@Controller
@RequestMapping
public class InvitationController {
    
    @Autowired
    private InvitationService invitationS;
    
    @GetMapping("/listar")
    public List<Invitation> getAllconfirmed(){
        return invitationS.getAllInvitation();
    }
    @GetMapping("/listar-cancel")
    public List<Invitation> getAllCancel(){
        return invitationS.getAllCancel();
    }
    
    @PostMapping
    public void confirmate(Invitation invitation){
        invitationS.saveInvitation(invitation);
    }
    
    @PutMapping
    public void cancelInvitation(Long id){
        invitationS.cancelInvitation(id);
    }
    
}
