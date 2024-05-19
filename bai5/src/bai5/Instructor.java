/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author phong
 */
public class Instructor {
    public abstract class Person {
    protected String id;
    protected String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public abstract int getSalaryOrScholarship();
}


class Student extends Person {
    private String className;

    public Student(String id, String name, String className) {
        super(id, name);
        this.className = className;
    }

    @Override
    public int getSalaryOrScholarship() {
        // Implement the logic to calculate the scholarship of the student
        return 1;
    }
}
    
}
