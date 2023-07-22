/* Check number is Positive or Negative */
// input n>0 +ve Number
// input n<0 -ve Number
// input n=0 Neither +ve Nor -ve

import java.util.Scanner;
class Check
{
    public static void main(String[] args) {
        
        int n;
        System.out.print("Enter any Number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n>0)
        {
            System.out.println("Positive Number");
        }
        else if(n<0)
        {
            System.out.print("Negative Number");
        }
        else
        {
            System.out.println("Neither +ve nor -ve");
        }
    }
}
