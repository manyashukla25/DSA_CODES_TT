import java.util.Scanner;
import java.lang.Math; 
public class CalcTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: LAVANYA");
        System.out.println("SAPID: 1000014237\n");
        System.out.println("Enter your number here: ");
        int num = sc.nextInt();
        double result;
        System.out.println("Enter your CHOICE here: ");
        System.out.println("1. Cube");
        System.out.println("2. Square");
        System.out.println("3. Absolute");
        System.out.println("4. Power");
        System.out.println("5. Binary to Decimal/Octa/Hexa");
        System.out.println("PRESS ANY KEY TO EXIT FROM THE MENU.");
        System.out.println("Input a number from 1-5: ");
        int input = sc.nextInt();
        switch (input)
        {
            case 1:
                result = (double)Math.pow(num,3);
                System.out.println("The result is: "+ result);
                break;
            case 2:
                result = (double)Math.pow(num,2);
                System.out.println("The result is: "+ result);
                break;
            case 3:
                result = Math.abs(num);
                System.out.println("The result is: "+ result);
                break;
            case 4:
                System.out.println("Power: ");
                int n = sc.nextInt();
                result = (double)Math.pow(num,n);
                System.out.println("The result is: "+ result);
                break;
            case 5:
                String hexa = Integer.toHexString(num);
                System.out.println("HexaDecimal Value is : " + hexa);
                String octal = Integer.toOctalString(num);
                System.out.println("Octal Value is : " + octal);
                String binary = Integer.toBinaryString(num);
                System.out.println("Binary Value is : " + binary);
                break;
            
            default :
                System.out.println("Sorry, not recognised the output.");
    }
}
}
