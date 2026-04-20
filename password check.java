import java.util.*;
public class P7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter username: ");
        String username=sc.nextLine();
        System.out.println("Enter password: ");
        String password=sc.nextLine();
        System.out.println("Re-Enter password: ");
        String re_enter_password=sc.nextLine();
        if(password.equals(re_enter_password)){
            System.out.println("Passwords match.");
        }
        else{
            System.out.println("Both are not matching.");
        }
        int maxTries=3;
        int n=0;
        while(maxTries>n){
            String pass=sc.nextLine();
            if(pass.equals(password)){
                System.out.println("Login Successful");
                break;
            }
            else{
                System.out.println("Wrong Password! Try again.");
                n++;
            }
        }
        if(n==maxTries)
            System.out.println("Account locked! Try after sometime.");
        sc.close();
    }
}
