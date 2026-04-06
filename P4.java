import java.util.*;
public class P4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String products[]=new String[50];
        String cart[]=new String[50];
        int bill[]=new int[n];
        int total=0;
        int cartSize=0;
        for(int i=0;i<n;i++){
            products[i]=sc.nextLine();
            bill[i]=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("==========Hello! Namaste.==========");
        System.out.println("1.Display Food Items\n2.Select Items\n3.Bill");
        System.out.println("Enter your choice: ");
        int choice=sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                System.out.println("----------Available Food Items----------");
                for(int i=0;i<n;i++){
                    System.out.println(products[i]+"  "+bill[i]);
                }
                break;
            case 2:
                System.out.println("~~~~~~~~~Selected Items~~~~~~~~~~");
                String p=sc.nextLine();
                cart[cartSize]=p;
                cartSize++;
                for(int i=0;i<cart.length;i++){
                    System.out.println(cart[i]);
                }
                break;
            case 3:
                System.out.println("^^^^^^^^^^Bill^^^^^^^^^^");
                for(int i=0;i<n;i++){
                    for(int j=0;j<n;j++){
                        if(cart[i].equals(products[j])){
                            total+=bill[j];
                        }
                    }
                }
                System.out.println("Total Bill: "+total);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        sc.close();
    }
}