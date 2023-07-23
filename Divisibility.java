/* W.a.p to check Divisibility of 5 */
// input 10 ----> Divisible by 5
// input 12 ----> Not Divisible by 5

import java.util.Scanner;
class Divisibility
{
    public static void main(String[] args) {
         
        int n;
        System.out.print("Enter any Number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n%5==0)
        {
            System.out.println("Divisible by 5");
        }
        else
        {
            System.out.print("Not Divisible by 5");
        }
    }
}
