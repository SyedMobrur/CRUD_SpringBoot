package com.Javaguide.springbootrestapi.bean;

public class Student {

    private int Id;
    private String firstName;
    private String lastName;

    public int getId() {
        return Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Student(int id, String firstName, String lastName) {
        Id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "Id=" + Id +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                '}';
//    }

    public String getLastName() {
        return lastName;
    }
}
