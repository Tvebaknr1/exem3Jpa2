
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;

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
public class Student extends Person{
    private int matNr;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date matDate;

    public Student(String firstName, String lastName, Date birthDate, int age, boolean isMarried,Date matDate, int matNr) {
        super(firstName, lastName, birthDate, age, isMarried);
        this.matDate = matDate;
        this.matNr = matNr;
    }

    
    public int getMatNr() {
        return matNr;
    }

    public void setMatNr(int matNr) {
        this.matNr = matNr;
    }

    public Date getMatDate() {
        return matDate;
    }

    public void setMatDate(Date matDate) {
        this.matDate = matDate;
    }
    
    
    
}
