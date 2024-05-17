package REFECTOR;

class Person {
    String id;
    String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Instructor extends Person {
    int yearOfExp;

    public Instructor(String id, String name, int yearOfExp) {
        super(id, name);
        this.yearOfExp = yearOfExp;
    }

    public int getSalary() {
        
        return 1;
    }
}

class Student extends Person {
    String className;

    public Student(String id, String name, String className) {
        super(id, name);
        this.className = className;
    }

    public int getScholarship() {
        return 1;
    }
}
