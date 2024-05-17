public class Main {
    public static void main(String[] args) {
        student student1 = new student();
        student1.setId(1);
        student1.setName("Ngoc huy");
        student1.setUsername("huybrox");
        student1.setPassword("password123");
        student1.setCaptcha("abc123");
        student1.printStudentInfo();

        student student2 = new student(2, "huy2", "huybrox2", "password456", "xyz789");
        student2.printStudentInfo();
    }
}