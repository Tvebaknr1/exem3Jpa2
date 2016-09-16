
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Inheritance(strategy=InheritanceType.JOINED)
public class Person implements Serializable {
    private String firstName;
    private String lastName;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date birthDate;
    private int age;
    private boolean isMarried;
    @OneToMany
    private List<Person> supervised;
    @ManyToOne
    private Person supervisor;
    private List<Grade> Grades = new ArrayList();

    public Person(String firstName, String lastName, Date birthDate, int age, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.age = age;
        this.isMarried = isMarried;
    }

    public void addGrade(Grade gra){
        Grades.add(gra);
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public List<Person> getSupervised() {
        return supervised;
    }

    public void setSupervised(List<Person> supervised) {
        this.supervised = supervised;
    }
    public void addSupervisor(Person p){
        supervised.add(p);
    }

    public Person getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Person supervisor) {
        this.supervisor = supervisor;
    }
    
    
    
}
