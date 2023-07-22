/* Leap Year Program */
// 1. century (100%=0 and 400%=0)
// 2. yearly (100%!=0 and 4%=0)

import java.util.Scanner;
class Year
{
    public static void main(String[] args) {

        int y;
        System.out.print("Enter any Year ");
        Scanner r=new Scanner(System.in);
        y=r.nextInt();

        if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
        {
            System.out.print("Leap Year");
        }
        else 
        {
            System.out.print("Not Leap Year");
        }
    }
}
