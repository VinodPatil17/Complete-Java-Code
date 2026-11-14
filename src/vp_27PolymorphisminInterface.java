class Cellphone1 {
    void calling(int call) {
        System.out.println("make calls..");
    }

    void picking(int pick) {
        System.out.println("connecting..");
    }
}

interface Wifi1 {
    String[] getNetworks();
    void connectToNetwork(String network);
}

interface Camera1 {
    void video();
    void photo();

    //we can use private in interface but it should be passed in method to read it otherthen method it can be read by anything
    private void hello(){
        System.out.println("hello guys");
    }

    //default is used because if we want to create method it stop whole process or brake existing code.
    //To escape from this we use default
    //we can override it
    default void videoInHd(){
        hello();
        System.out.println("video in hd");
    }
}

interface Speaker1 {
    void music();
    void headphone();
}

class Smartphone1 extends Cellphone1 implements Speaker1, Camera1, Wifi1 {

    public void music() {
        System.out.println("playing music...");
    }

    public void headphone() {
        System.out.println("music in headphone...");
    }

    public void video() {
        System.out.println("capturing Video...");
    }

//    public void videoInHd() {
//        System.out.println("default method is overrided");
//    }


    public void photo() {
        System.out.println("taking photo...");
    }

    public String[] getNetworks() {
        System.out.println("getting list of networks...");
        String[] networkList = {"Vinod", "Karthik", "virat"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("connecting to network...");
    }
}

public class vp_27PolymorphisminInterface {
    public static void main(String[] args){
        // if we use referance as interface and object as class
        //then we can only access the interface method not all method
        Camera1 vvv = new Smartphone1();
        vvv.photo();
        vvv.video();
        vvv.videoInHd();

        //vvv.music(); --> throw error
    }
}