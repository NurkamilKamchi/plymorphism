package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shark shark = new Shark("white", 12, "m");
        Turtle turtle = new Turtle("green", 18, "f");
        Eagle eagle = new Eagle("white", 40, "m");
        Animal[] animals = new Animal[]{shark, turtle, eagle};
        System.out.println(Arrays.toString(animals));
        shark.move();
        turtle.move();
        eagle.move();
        for (Animal animal : animals) {
            if (animal.getColor().equalsIgnoreCase("white")) {
                System.out.println(animal);
            }

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter gender: ");
        String genderConsol = scanner.next();
        for (Animal animal : animals) {
            if (animal.getGender().equalsIgnoreCase(genderConsol)) {
                System.out.println(animal);

            }
        }
        System.out.println("Get shark: ");
        Shark.getShark(animals);


    }



}
