/* Prime b/w two Numbers */
// input first number 10
// input second number 20
// prime numbers ---> 11 13 17 19

import java.util.Scanner;
class B 
{
    public static void main(String[] args) {
         int n1,n2,i,j;
         System.out.print("Enter Two Numbers ");
         Scanner ref=new Scanner(System.in);
         n1=ref.nextInt();
         n2=ref.nextInt();

         for(i=n1;i<=n2;i++)
         {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                break;
            }
            if(i==j)
            System.out.print(j + " ");
         }
    }
}
