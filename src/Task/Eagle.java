package Task;

public class Eagle extends Animal {
    public Eagle(String color, int age, String gender) {
        super(color, age, gender);
    }

    @Override
    public String toString() {
        return "Eagle{} " + super.toString();
    }

    @Override
    public void move() {
        System.out.println("Fly!!!");
    }
}
