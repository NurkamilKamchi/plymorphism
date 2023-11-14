package Task;

public class Turtle extends Animal {
    public Turtle(String color, int age, String gender) {
        super(color, age, gender);
    }

    @Override
    public String toString() {
        return "Turtle{} " + super.toString();
    }

    @Override
    public void move() {
        System.out.println("SWIM!!!");
    }
}
