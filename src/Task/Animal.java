package Task;

import java.util.Scanner;

public abstract class Animal {
    private String color;
    private int age;
    private String gender;

    public Animal(String color, int age, String gender) {
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void Walk() {
        System.out.println("I'm walking!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';


    }

    public void move() {
    }

}
