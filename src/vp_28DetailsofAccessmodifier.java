class AccessModifier{
    public int A = 5;
    protected int B = 6;
    int C = 7;
    private int D = 8;

    void meth1(){
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
    }
}

public class vp_28DetailsofAccessmodifier {
    public static void main(String[] args){
        AccessModifier Ass = new AccessModifier();
        //In Same class you can access all Accessmodifiers
        Ass.meth1();

        //PACKAGE
        //if it is in same package can access public, protected, default but not private
        //if it is from different package can access public and protected (through inheritance). But cant access private and default.

        //SUBCLASS
        //if it is Subclass with same package can access public,private,protected but not private.
        //if it is Subclass with different package can access only public and protected(via inheritance), but not default and private.

        //WORLD
        //if it from other file or project any thing in the world in that case
        //in that case we only can access public
    }
}