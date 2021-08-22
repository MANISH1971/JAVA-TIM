package com.timbuchalka;
// this.age = (age<0 || age>100) ? 0 : age; // ternary operator
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public void setFirstName(String parameter) {
        this.firstName = parameter;
    }
    public void setLastName(String parameter) {
        this.lastName = parameter;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = age=0;
        }
        this.age = age;
    }
    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }
        if (lastName.isEmpty() == true) {
            return this.firstName;
        }
        if (firstName.isEmpty() == true) {
            return this.lastName;
        }
        return this.firstName + " " + this.lastName;
    }
}
