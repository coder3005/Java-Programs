/* Palindrome Number Program */
// input number  121 ---> 121

import java.util.Scanner;
class A 
{
    public static void main(String[] args) {
        
        int n,r,s=0,c;
        System.out.print("Enter any Number ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        c=n;

        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        System.out.print("Palindrome Number");
        else 
        System.out.print("Not Palindrome Number");

    }
}
