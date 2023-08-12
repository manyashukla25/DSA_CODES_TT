import java.util.Scanner;

public class LeapYearTT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = sc.nextInt();
        if(year % 4 ==0){ //IF THE YEAR ENTERED IS COMPLETELY DEVISIBLE BY 4 AND IT IS GIVING THE REMAINDER 0 THEN IT IS A LEAP YEAR
            if(year%100 ==0){// IT IS NOT A LEAP YEAR
                if(year%400==0){ //IT IS A LEAP YEAR
                    System.out.println("Leap Year");
                }
                else{
                    System.out.println("Not a Leap Year");
                }
            }
            else{
               System.out.println("Leap Year"); 
            }
        }
        else{
            System.out.println("Not a Leap year");
        }
        sc.close();
    }
}
