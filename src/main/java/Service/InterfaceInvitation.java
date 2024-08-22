/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.List;
import model.Invitation;
/**
 *
 * @author pablo
 */
public interface InterfaceInvitation {
    public List <Invitation> getAllInvitation();
    public List <Invitation> getAllCancel();
    public void saveInvitation(Invitation invitation );
    public void cancelInvitation(Long id);
}
