class Employee{
    int id;
    String name;
    int salary;
    public void Details(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
    public int getSalary(){
        return salary;
    }

}

public class vp_13OOPsClass{
    public static void main(String[] args) {
        Employee Vinod = new Employee();
        Employee Karthik = new Employee();
        Employee Shyam = new Employee();

        //Setting Attributes
        Vinod.id = 25;
        Vinod.salary = 10000000;
        Karthik.id = 55;
        Shyam.id = 14;
        Vinod.name = "Vinod";
        Karthik.name = "Karthik";
        Shyam.name = "Shyam";

        Vinod.Details();
        Karthik.Details();
        Shyam.Details();

        int salary = Vinod.getSalary();
    }
}
