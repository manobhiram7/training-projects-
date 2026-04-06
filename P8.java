import java.util.*;
public class P8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of units consumed: ");
        int units=sc.nextInt();
        int bill=0;
        if(units>=0&&units<=100){
            bill=units*2;
            System.out.println("Rs "+bill);
        }
        else if(units>=101&&units<=200){
            bill=(100*2)+(units-100)*3;
            System.out.println("Rs "+bill);
        }
        else if(units>=201){
            bill=(100*2)+(100*3)+(units-200)*5;
            System.out.println("Rs "+bill);
        }
        sc.close();
    }
}