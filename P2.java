import java.util.*;
public class P2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String names[]=new String[100];
        System.out.println("Enter Patient Names: ");
        for(int i=0;i<n;i++){
            names[i]=sc.nextLine();
        }
        int choice;
        System.out.println("==========Hello! Welcome.==========");
        System.out.println("1.Add Patient\n2.View Patient\n3.Search Patient\n4.Delete Patient");
        System.out.println("Enter your choice: ");
        choice=sc.nextInt();
        sc.nextLine();
        switch(choice){
            case 1:
                System.out.println("Enter the Patient Name: ");
                String name=sc.nextLine();
                names[n]=name;
                n++;
                for(int i=0;i<n;i++){
                   System.out.println(names[i]+" ");
                }
                break;
            case 2:
                System.out.println("Enter patient name: ");
                String view_name=sc.nextLine();
                boolean found=false;
                for(int i=0;i<n;i++){
                    if(view_name.equals(names[i])){
                        System.out.println("Patient Details: "+names[i]);
                        found=true;
                    }
                }
               if(!found){
                    System.out.println("Invalid! Patient details not found");
                }
                break;
            case 3:
                System.out.println("Patient name: ");
                String search_name=sc.nextLine();
                boolean isFound=false;
                for(int i=0;i<n;i++){
                    if(search_name.equals(names[i])){
                        System.out.println("Patient Details: "+names[i]);
                        isFound=true;
                        break;
                    }                
                }
                if(!isFound)
                    System.out.println("Patient Details not found!");
                break;
            case 4:
                System.out.println("Patient name to be deleted: ");
                String del_name=sc.nextLine();
                    for(int i=0;i<n;i++){
                        if(del_name.equals(names[i])){
                            for(int j=i;j<n-1;j++){
                                names[j]=names[j+1];
                            }
                            n--;
                            break;
                        }
                       }
                    for(int i=0;i<n;i++){
                    System.out.println("Patient'ss after deletion"+names[i]);
                    }
                    break;
            default:
                System.out.println("Invalid! Choose from the given options.");
                break;
        }
        sc.close();
    }
}