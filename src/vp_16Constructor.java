class worker{
    private String name;
    private int id;

    //Constructor automatically call (constructor w/o parameter)
    public worker(){
        name = "Vinod Patil";
        id = 245;
    }

    //Constructor overloading
    public worker(String n, int iid){
        name = n;
        id = iid;
    }


    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int d){
        id = d;
    }

    public int getId(){
        return id;
    }
}
public class vp_16Constructor{
    public static void main(String[] args){
        // w/o parameters
        worker vinod = new worker();

        System.out.println(vinod.getName());
        System.out.println(vinod.getId());

        // with parameters Automatically overload constructor
        worker Vinod = new worker("Arjun", 07);
        System.out.println(Vinod.getName());
        System.out.println(Vinod.getId());
    }
}