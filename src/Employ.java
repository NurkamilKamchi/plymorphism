public class Employ {
    private static String name;
    protected int salary;


    public Employ(String name, int salary) {
        this.name = name;

    }
    public  void CalculateSalary (){
        System.out.println("Salary for "+ name);
    }
}
