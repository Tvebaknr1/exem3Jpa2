
import java.io.Serializable;
import javax.persistence.Entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emil
 */
@Entity
public class Grade implements Serializable {
    private String name;
    private int value;
    
}
