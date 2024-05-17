package Refactor;
class Employee {
    String name;
    String ID;

    public Employee(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public int computeSalary() {
        return 0;
    }
}

class Coder extends Employee {
    int level;

    public Coder(String name, String ID, int level) {
        super(name, ID);
        this.level = level;
    }

    
    public int computeSalary() {
        return 0;
    }
}

class Manager extends Employee {
    public Manager(String name, String ID) {
        super(name, ID);
    }

    
    public int computeSalary() {
        return 20000000;
    }
 
        public static void main(String[] args) {
            Coder coder = new Coder("Van A", "01", 2);
            int coderSalary = coder.computeSalary();
            System.out.println("Coder Salary: " + coderSalary);

            Manager manager = new Manager("Van B", "02");
            int managerSalary = manager.computeSalary();
            System.out.println("Manager Salary: " + managerSalary);
        }
    }
