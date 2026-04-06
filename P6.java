import java.util.*;
public class P6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("Enter a number (1-100): ");
        int n=sc.nextInt();
        int num=rand.nextInt(100)+1;
        while(true){
            if(n==num){
                System.out.println("Your guess is correct");
                break;
            }
            else{
                System.out.println("Try again");
                n=sc.nextInt();
            }
        }
        sc.close();
    } 
}