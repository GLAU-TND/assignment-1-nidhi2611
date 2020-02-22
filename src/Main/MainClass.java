package Main;

import java.util.Scanner;

public class MainClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to DBC's Contact List App");
        System.out.println("Enter 1 to add a new contact");
        System.out.println("Enter 2 to view all contacts");
        System.out.println("Enter 3 to search for a contact");
        System.out.println("Enter 4 to delete a contact");
        System.out.println("Enter 5 to exit program");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                int i = 0;
                System.out.println("YOU HAVE CHOOSEN TO ADD A CONTACT");
                String fname = sc.next();
                String lname = sc.next();
                long number = sc.nextLong();
                System.out.println("WANT TO ENTER EMAIL ID?");
                char answer = sc.next().charAt(0);
                if (answer == 'y') {
                    String email = sc.next();
                }
                break;
            case 2:
                System.out.println("YOU HAVE CHOOSED TO VIEW THE LIST");
                break;
            case 3:
                System.out.println("YOU HAVE CHOOSED to search a contact");
                System.out.println("ENTER FIRST NAME");
                String first = sc.next();
                break;
            case 4:
                System.out.println("YOU HAVE CHOOSED TO DELETE A CONTACT");
                String dname = sc.next();
                break;
            case 5:
                System.out.println("EXIT THE PROGRAM");
                break;
            default:
                System.out.println("NO SUCH CASE FOUND");
        }
    }
}
