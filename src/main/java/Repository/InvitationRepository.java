
package Repository;

import model.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pablo
 */
@Repository
public interface InvitationRepository  extends JpaRepository<Invitation, Long> {
    
}
