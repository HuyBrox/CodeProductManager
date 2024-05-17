class Student extends Person {
    String ClassName;

    public Student(String Id, String name, String ClassName) {
        super(Id, name);
        this.ClassName = ClassName;
    }

    public int getScholarship() {
        return 1;
    }
}