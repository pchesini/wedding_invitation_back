
package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Invitation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    private String nombre;
    private String email;
    private Date fechaRecepcion;
    
    
}
