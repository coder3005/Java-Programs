/* Calculate Power of a Number */
// input n=5
// power p=2
// 5*5=25

import java.util.Scanner;
class Power
{
    public static void main(String[] args) {

    int n,p,result=1;
    System.out.print("Enter No. ");
    Scanner r=new Scanner(System.in);
    n=r.nextInt();
    System.out.print("Enter Power ");
    p=r.nextInt();

    for(int i=1;i<=p;i++)
    {
        result=n*result;
    }
    System.out.print("Power "+result);
    }
}
