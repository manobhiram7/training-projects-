import java.util.*;
public class P9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int seats[]=new int[25];
        for(int i=0;i<n;i++){
            seats[i]=sc.nextInt();
        }
        int booked_seats[]=new int[25];
        int bs=sc.nextInt();
        for(int i=0;i<bs;i++){
            booked_seats[i]=sc.nextInt();
        }
        System.out.println("1.Available Seats\n2.Book Seat\nShow Booked Seats");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Available Seats");
                for(int i=0;i<n;i++){
                    System.out.print(seats[i]+" ");
                }
                break;
            case 2:
                System.out.println("Book Your Seat");
                System.out.print("Enter the seat number: ");
                int select=sc.nextInt();
                for(int i=0;i<n;i++){
                    if(select==seats[i]){
                        booked_seats[i]=select;
                        for(int j=i;j<n-1;j++){
                            seats[i]=seats[i+1];
                        }
                        n--;
                        break;
                    }
                }
                break;
            case 3:
                System.out.println("Booked Seats");
                for(int i=0;i<bs;i++){
                    System.out.print(booked_seats[i]+" ");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}