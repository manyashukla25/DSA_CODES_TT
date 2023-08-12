import java.util.Scanner;
public class MenuTT 
{
    public static void main(String[] args) {
        int bill = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: LAVANYA");
        System.out.println("SAPID: 1000014237\n");
        System.out.println("Menu:");
        System.out.println("1. Pastry : 80");
        System.out.println("2. Noodles : 90");
        System.out.println("3. Momos : 95");
        System.out.println("4. Chocochip Cookies : 170");
        System.out.println("5. Oreo Shake : 140");
        System.out.println("6. Garlic Bread : 100");
        System.out.println("7. Mixed Juice : 65");
        System.out.println("8. Tomato Soup : 105");
        
        System.out.println(" PRESS ANY KEY TO EXIT FROM THE MENU.");
        System.out.println("Input a number from 1-8: ");
        int input  = sc.nextInt();
        switch (input)
        {
            case 1:
                bill += 80;
                break;
            case 2:
                bill += 90;
                break;
            case 3:
                bill += 95;
                break;
            case 4:
                bill += 170;
                break;
            case 5:
                bill += 140;
                break;
            case 6:
                bill += 100;
                break;
            case 7:
                bill+= 65;
                break;
            case 8:
                bill+= 105;
                break;
            default :
                System.out.println("Sorry, not recognised the output.");
        }
        System.out.println("Thank you for your service!") ;
        System.out.println("Your bill is: " + bill);
    }

}
