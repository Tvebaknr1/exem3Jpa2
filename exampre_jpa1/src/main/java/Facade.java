
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emil
 */
public class Facade {
    private static List<Person> persons = new ArrayList();
    private static List<Student> Students =  new ArrayList();
    private static List<Employee> Employees = new ArrayList();
    
    public static Person CreatePerson(String firstName, String lastName,Date birthDate,int age, boolean married){
        Person Per = new Person(firstName, lastName, birthDate, age, married);
        persons.add(Per);
        return Per;
    }
   
    public static Student CreateSudent(String firstName,String lastName,Date birthDate,int age,boolean married,Date matDate,int matNr){
        Student stu = new Student(firstName, lastName, birthDate, age, married, matDate,matNr );
        Students.add(stu);
        return stu;
    }
    public static void addgradeToStudent(Student stu, Grade grade){
        stu.addGrade(grade);
    }
    public static void addsupervisorToperson(Person per,Person bo){
        bo.setSupervisor(per);
        per.addSupervisor(bo);
        
    }

    public static List<Person> getPersons() {
        return persons;
    }

    public static List<Student> getStudents() {
        return Students;
    }

    public static List<Employee> getEmployees() {
        return Employees;
    }

    public static void setPersons(Person e) {
        Facade.persons.add(e);
    }

    public static void setStudents(Student Students) {
        Facade.Students.add(Students);
    }

    public static void setEmployees(Employee e) {
        Facade.Employees.add(e);
    }
    public static Person findPerson(String firstName){
        for (Person person : persons) {
            if(person.getFirstName().equals(firstName))
                return person;
        }
        return null;
    }
    public static Student findStudent(String firstName){
        for (Student student : Students) {
            if(student.getFirstName().equals(firstName))
                return student;
        }
        return null;
    }
    public static Employee findEmployee(String firstName){
        for (Employee Employee : Employees) {
            if(Employee.getFirstName().equals(firstName))
                return Employee;
        }
        return null;
    }
    public static Person findAny(String firstName){
        for (Person Person : Employees) {
            if(Person.getFirstName().equals(firstName))
                return Person;
        }
        for (Person Person : persons) {
            if(Person.getFirstName().equals(firstName))
                return Person;
        }
        for (Person Person : Students) {
            if(Person.getFirstName().equals(firstName))
                return Person;
        }
        return null;
    }
    public static boolean deleteEmployee(Employee Employee)
    {
        return Employees.remove(Employee);
    }
    public static boolean deleteStudent(Student student)
    {
        return Students.remove(student);
    }
    public static boolean deletePerson(Person Person)
    {
        return persons.remove(Person);
    }
    
}
