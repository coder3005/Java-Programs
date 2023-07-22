/* Print sum of Odd OR Even in Given Range */
// Even 10 (0+2+4+6+8+10=30)
// Odd 11 (1+3+5+7+9+11=36)

import java.util.Scanner;
class OddEven
{
    public static void main(String[] args) {
          
        int n,i,sum=0;
        System.out.print("Enter Range ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n%2==0)
        {
            for(i=0;i<=n;i=i+2)
            {
                sum=sum+i;
            }
            System.out.print("Sum of Even Number "+ sum);
            
        }
        else
        {
            for(int p=1;p<=n;p=p+2)
            {
                sum=sum+p;
            }
             System.out.print("Sum of Odd Number "+ sum);


        }
    }
}
