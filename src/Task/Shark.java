package Task;

public class Shark extends Animal {
    public Shark(String color, int age, String gender) {
        super(color, age, gender);
    }

    @Override
    public String toString() {
        return "Shark{} " + super.toString();
    }

    @Override
    public void move() {
        System.out.println("Attack!!!");
        ;
    }

    public static void getShark(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                System.out.println(animal);
            }
        }
    }
}
