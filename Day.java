/* Enter code of Day and Print Name of Day */
// input code(0 to 6)

import java.util.Scanner;
class Day 
{
    public static void main(String[] args) {

        int n;
        System.out.print("Enter code of Day ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n==1)
        {
            System.out.println("Monday");
        }
        else if(n==2)
        {
            System.out.println("Tuesday");
        }
        else if(n==3)
        {
            System.out.println("Wednesday");
        }
        else if(n==4)
        {
            System.out.println("Thursday");
        }
        else if(n==5)
        {
            System.out.println("Friday");
        }
        else if(n==6)
        {
            System.out.println("Saturday");
        }
        else if(n==0)
        {
            System.out.println("Sunday");
        }
        else 
        {
            System.out.print("Wrong code");
        }
    }
}
