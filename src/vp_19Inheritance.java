class Animals{
    int x = 15;

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

}

class dogs extends Animals{
    String bark;

    public void setBark(){
        System.out.println("Dogs bark woow woow");
    }

    public String getBark(){
        return bark;
    }
}

public class vp_19Inheritance {
    public static void main(String[] args){
        dogs dog = new dogs();
        Animals Animal = new Animals();
        //dogs class inherited from Animals
        System.out.println(dog.getX());

        Animal.setX(69);
        System.out.println(Animal.getX());
    }
}