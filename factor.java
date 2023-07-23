/* Find factor of a Number */
// input 10 ----> 1 2 5 10 

import java.util.Scanner;
class factor 
{
    public static void main(String[] args) {
        
        int n;
        System.out.print("Enter any Number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
