class Empl{
    private String name;
    private int id;

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

public class vp_15PrivateAccessmodifier{
    public static void main(String[] args){
        Empl vinod = new Empl();
//        vinod.id =45;
//        vinod.name = "Vinod";  --> throw an error due to private access modifier

        vinod.setName("vinod patil");
        System.out.println(vinod.getName());
        vinod.setId(21);
        System.out.println(vinod.getId());
    }
}