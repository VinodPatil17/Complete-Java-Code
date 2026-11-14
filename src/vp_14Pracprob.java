/*class Employees{
    int salary;
    String name;

    public int getSalary(){
        System.out.println(salary);
        return salary;
    }

    public void getName(){
        System.out.println(name);
    }

    public void setName(String X){
        String newName = X;
        System.out.println(newName);
    }

}
public class vp_14Pracprob{
    public static void main(String[] args) {
        Employees Vinod = new Employees();
        Employees sss = new Employees();

        Vinod.name = "Vinod";
        Vinod.salary = 10000;

        sss.name = "shivu";
        sss.salary = 100000;

        Vinod.getSalary();
        sss.getSalary();
        Vinod.getName();
        sss.getName();
        sss.setName("Shinde");

    }
}
*/

//find area and perimeter of square using side --> problem

/*class square {
    int side;
    public int area(int side){
        return side * side;
    }

    public int perimeter(int side){
        return 4*side;
    }
}
public class vp_14Pracprob{
    public static void main(String[] args){
        square vin = new square();
        System.out.println(vin.area(3));
        System.out.println(vin.perimeter(2));

        //2nd square initilization

        square karth = new square();
        System.out.println(karth.area(5));
        System.out.println(karth.perimeter(5));
    }
}
*/

//find area and perimeter of rectangle using side --> problem

class rectangle{
    int length;
    int width;

    public int area(int length, int width){
        return length * width;
    }

    public int perimeter(int length, int width){
        return 2*(length + width);
    }
}

public class vp_14Pracprob{
    public static void main(String[] args){
        rectangle ooo = new rectangle();
        System.out.println(ooo.area(3,5));
        System.out.println(ooo.perimeter(5,5));
    }
}