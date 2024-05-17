class Instructor extends Person {
    int yearOfExp;

    public Instructor(String Id, String name, int yearOfExp) {
        super(Id, name);
        this.yearOfExp = yearOfExp;
    }

    public int getSalary() {
        return 1;
    }
}