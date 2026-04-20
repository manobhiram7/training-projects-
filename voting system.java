import java.util.*;
public class P5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String candidates[]=new String[25];
        int vote[]=new int[n];
        for(int i=0;i<n;i++){
            candidates[i]=sc.nextLine();
            vote[i]=0;
        }
        System.out.println("1.Display Candidates\n2.Vote for Candidate\n3.Winner");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Candidates List");
                for(int i=0;i<n;i++){
                    System.out.println(i+" "+candidates[i]);
                }
                break;
            case 2:
                System.out.println("Vote for Candidate");
                int v=sc.nextInt();
                if(v>0&&v<n){
                    vote[v]++;
                    System.out.println(candidates[v]);
                }
                else{
                    System.out.println("Invalid Candidate");
                }
                break;
            case 3:
                int max=vote[0];
                int winner=0;
                System.out.println("Winner");
                for(int i=1;i<n;i++){
                    if(vote[i]>max){
                        max=vote[i];
                        winner=i;
                    }
                }
                System.out.println(candidates[winner]);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}
