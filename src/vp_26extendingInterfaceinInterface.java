interface firstOne{
    void methOne();
    void methTwo();
}
interface secondOne extends firstOne{
    void methThree();
    void methFour();
}
class thirdOne implements secondOne{
    public void methOne(){
        System.out.println("method 1 of interface 1");
    }
    public void methTwo(){
        System.out.println("method 2 of interface 1");
    }
    public void methThree(){
        System.out.println("method 1 of interface 2");
    }
    public void methFour(){
        System.out.println("method 2 of interface 2");
    }
}
public class vp_26extendingInterfaceinInterface {
    public static void main(String[] args){
        thirdOne lele = new thirdOne();
        lele.methOne();
        lele.methTwo();
        lele.methThree();
        lele.methFour();
    }
}