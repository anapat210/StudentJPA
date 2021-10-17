/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabasewithjpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author asus
 */
public class StudentDatabaseWithJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Student std = new Student(3,"Fah",3.52);
//        StudentTable.insertStudent(std);
        Student std1 = StudentTable.findStudentById(3);
//        std1.setName("Fahh");
//        StudentTable.updateEmployee(std1);
        StudentTable.removeEmployee(std1);
        
        List<Student> studentList = StudentTable.findAllStudent();
        printAllStudent(studentList);
    }
    public static void printAllStudent(List<Student> studentList) {
        for(Student std : studentList) {
           System.out.print(std.getId() + " ");
           System.out.print(std.getName() + " ");
           System.out.println(std.getGpa() + " ");
       }
    }

    
}
