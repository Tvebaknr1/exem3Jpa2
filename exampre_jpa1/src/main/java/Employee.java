
import java.util.Date;
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
public class Employee  extends Person{
    private int soSecNr;
    private float wage;
    private String taxClass;

    public Employee(int soSecNr, float wage, String taxClass, String firstName, String lastName, Date birthDate, int age, boolean isMarried) {
        super(firstName, lastName, birthDate, age, isMarried);
        this.soSecNr = soSecNr;
        this.wage = wage;
        this.taxClass = taxClass;
    }

    public int getSoSecNr() {
        return soSecNr;
    }

    public void setSoSecNr(int soSecNr) {
        this.soSecNr = soSecNr;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }
    
}
