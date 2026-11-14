class white implements Runnable{
    public void run(){
        int i = 0;
        while(i < 1000){

            System.out.println("Cop sick");
            i++;
        }
    }
}

class black implements Runnable{
    public void run(){
        int i = 0;
        while(i < 1000){

            System.out.println("sick cop");
            i++;
        }
    }
}

public class vp_30ThreadusingRunnable {
    public static void main(String[] args){
        white bullet1 = new white();
        Thread gun1 = new Thread(bullet1);
        black bullet2 = new black();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}