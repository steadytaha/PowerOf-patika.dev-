import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {
        
        int k;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give a number: ");
        k = input.nextInt();
        
        for(int i=1, j=1;(i<=k && j<=k); i*=4, j*=5){
            if(i!=j){
                System.out.println(i + "\n" + j);
            }else{
                System.out.println(i);
            }
        }
    }
}
