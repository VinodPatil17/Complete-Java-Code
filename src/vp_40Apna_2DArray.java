import java.util.*;

public class vp_40Apna_2DArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target value :");
        int x = sc.nextInt();

        System.out.println("enter row value:");
        int rows = sc.nextInt();
        System.out.println("enter column value:");
        int col = sc.nextInt();

        int [][] arr = new int[rows][col];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] == x){
                    System.out.print(i + " " + j);
                }
                System.out.println();
            }
        }
    }
}
