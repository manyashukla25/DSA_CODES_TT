import java.util.Scanner;
public class ATMMachineTT {
    public static void main(String[] args) {
        int accBalance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: LAVANYA");
        System.out.println("SAPID: 1000014237\n");
        System.out.println("Menu: ");
        System.out.println("1. Withdraw ");
        System.out.println("2. Deposit ");
        System.out.println("3. Check Balance");
        System.out.println(" PRESS ANY KEY TO EXIT FROM THE MENU.");
        System.out.println("Input a number from 1-3: ");
        int input  = sc.nextInt();
            switch (input)
        {
            case 1:
                System.out.print("Enter the amount you want to withdraw: ");
                int withdraw = sc.nextInt();
                System.out.println("Withdrawing... ");
                accBalance -= withdraw;
                System.out.println("Available Balance : " + accBalance);
                break;
            case 2:
                System.out.print("Enter the amount you want to deposit: ");
                int deposit = sc.nextInt();
                System.out.println("Depositing... ");
                accBalance += deposit;
                System.out.println("Available Balance : " + accBalance);                
                break;
            case 3:
                System.out.println("Available Balance : " + accBalance); 
                break;
            default:
                System.out.println("Sorry, not recognised the output.");
        }
        System.out.println("Thank you for your service!");
    }
}

