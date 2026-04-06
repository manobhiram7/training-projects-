import java.util.*;
import java.text.DecimalFormat;
public class P1{
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("0.00");
        int n=sc.nextInt();
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        sc.nextLine();
        int marks[]=new int[n];
        System.out.println("Enter marks: ");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        int total=0;
        double avg=0.0;
        for(int i=0;i<n;i++){
            total+=marks[i];
        }
        avg=(double)total/n;
        String avg_f=df.format(avg);
        System.out.println("Student Name: "+name);
        for(int num:marks){
            System.out.println("Marks: "+num+" ");
        }
        System.out.println("Total Marks: "+total);
        System.out.println("Average Marks: "+avg_f);
        if(total>=385&&total<=400)
            System.out.println("Grade-S");
        else if(total>=365&&total<=384)
            System.out.println("Grade-A");
        else if(total>=345&&total<=364)
            System.out.println("Grade-B");
        else if(total>=325&&total<=344)
            System.out.println("Grade-C");
        else if(total>=295&&total<=324)
            System.out.println("Grade-D");
        else if(total>=151&&total<=294)
            System.out.println("Grade-E");
        else if(total<=150)
            System.out.println("Grade-F");
        sc.close();
    }
}