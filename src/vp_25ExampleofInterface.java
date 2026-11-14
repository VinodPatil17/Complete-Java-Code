class Cellphone {
    void calling(int call) {
        System.out.println("make calls..");
    }

    void picking(int pick) {
        System.out.println("connecting..");
    }
}

interface Wifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

interface Camera {
    void video();
    void photo();
}

interface Speaker {
    void music();
    void headphone();
}

class Smartphone extends Cellphone implements Speaker, Camera, Wifi {

    public void music() {
        System.out.println("playing music...");
    }

    public void headphone() {
        System.out.println("music in headphone...");
    }

    public void video() {
        System.out.println("capturing Video...");
    }

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

public class vp_25ExampleofInterface {
    public static void main(String[] args) {
        Smartphone vivo = new Smartphone();

        vivo.calling(6);
        vivo.picking(4);

        String[] arr = vivo.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }

        vivo.music();
        vivo.headphone();
        vivo.video();
        vivo.photo();
        vivo.connectToNetwork("Vinod");
    }
}