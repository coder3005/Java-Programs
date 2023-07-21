/* Find factorial of a Number */
// input  5 -----> 120 (5*4*3*2*1)

import java.util.Scanner;
class Fact 
{
    public static void main(String[] args) {

        int n,fact=1;
        System.out.print("Enter any Number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.print("Factorial "+ fact);
    }
}
