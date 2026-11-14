class cylinder{
    private int radius;
    private int height;

    public void setRadius(int value){
        radius = value;
    }

    public int getRadius(){
        return radius;
    }

    public void setHeight(int n){
        height = n;
    }

    public int getHeight(){
        return height;
    }

    public double surfaceArea(){
        double result = 2*3.14*radius*height + 2*3.14*radius*radius;
        return result;
    }
}

public class vp_18CylinderSurface {
    public static void main(String[] args){
        cylinder vinod = new cylinder();
        vinod.setHeight(20);
        vinod.setRadius(5);
        System.out.println(vinod.getRadius());
        System.out.println(vinod.getHeight());

        System.out.println(vinod.surfaceArea());
    }
}