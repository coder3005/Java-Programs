/* Prime Number Program */
// input number 7 ----> Prime Number

import java.util.Scanner;
class Prime 
{
    public static void main(String[] args) {
        
        int n,count=0;
        System.out.print("Enter any number ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();

        for(int i=1; i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        System.out.print("Prime Number");
        else 
        System.out.print("Not Prime Number");
    }
}
