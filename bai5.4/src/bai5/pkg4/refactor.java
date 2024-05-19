/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5.pkg4;

/**
 *
 * @author phong
 */
class refactor {

class Employee {
    String name;
    String id;

    public void setName(String name) {
        this.name = name;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void computeSalary() {
        System.out.println("The salary of an employee");
    }
}

class Coder extends Employee {

    public void setLevel(int level) {
    }

    @Override
    public void computeSalary() {
        System.out.println("The salary of Coder");
    }
    }

class Manager extends Employee {
  

public class Main {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.setName("John Doe");
        coder.setID("123456");
        coder.setLevel(3);
        coder.computeSalary();

        Manager manager = new Manager();
        manager.setName("Jane Doe");
        manager.setID("654321");
        System.out.println("The salary of Manager: " + manager.computeSalary());
    }
}
}
}

