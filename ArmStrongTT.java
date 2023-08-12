import java.util.Scanner;

public class ArmStrongTT {
     public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Name: LAVANYA");
        System.out.println("SAPID: 1000014237\n");
     System.out.print("Enter Your Number:");
     int number = scan.nextInt();
     int originalNumber, remainder, result = 0, n = 0;
    originalNumber = number;
    for (; originalNumber != 0; originalNumber /= 10, ++n) ;
    originalNumber = number;
    for (; originalNumber != 0; originalNumber /= 10) {
    remainder = originalNumber % 10;
    result += Math.pow(remainder, n);
    }
   
    if (result == number)
    System.out.println(number + " is an Armstrong number.");
    else
    System.out.println(number + " is not an Armstrong number.");
    }
    }
   
