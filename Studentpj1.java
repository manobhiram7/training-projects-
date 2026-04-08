import java.util.LinkedList;
import java.util.Scanner;

class Studentpj {
    String name;
    int rollNo;

    Studentpj(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class Studentpj1 {
    public static void main(String[] args) {
        LinkedList<Studentpj> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();

                    list.add(new Studentpj(name, roll));
                    System.out.println("Student Added");
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("No students found");
                    } else {
                        System.out.println("\nStudent List:");
                        for (Studentpj s : list) {
                            System.out.println("Name: " + s.name + ", Roll No: " + s.rollNo);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    int searchRoll = sc.nextInt();
                    boolean found = false;

                    for (Studentpj s : list) {
                        if (s.rollNo == searchRoll) {
                            System.out.println("Found -> Name: " + s.name + ", Roll No: " + s.rollNo);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll No to delete: ");
                    int deleteRoll = sc.nextInt();
                    boolean removed = false;

                    for (Studentpj s : list) {
                        if (s.rollNo == deleteRoll) {
                            list.remove(s);
                            System.out.println("Student deleted");
                            removed = true;
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Student not found");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}