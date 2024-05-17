public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("INS001", "huy1", 5);
        Student student = new Student("STD001", "huy2", "ClassA");

        System.out.println("Instructor: " + instructor.name);
        System.out.println("Student: " + student.name);
    }
}