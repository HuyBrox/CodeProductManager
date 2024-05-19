/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author phong
 */
public class student {
    public class Student {
    public void createNewUser(StudentDetails studentDetails) {
        System.out.println(studentDetails.id() + " " + studentDetails.name());
    }

    public static class StudentDetails {
        private final int id;
        private final String name;
        private final String username;
        private final String password;
        private final String captcha;

        public StudentDetails(int id, String name, String username, String password, String captcha) {
            this.id = id;
            this.name = name;
            this.username = username;
            this.password = password;
            this.captcha = captcha;
        }

        public int id() {
            return id;
        }

        public String name() {
            return name;
        }

        // Add getter methods for username, password, and captcha
    }
}
    
}
