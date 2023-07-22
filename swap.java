/* Swap of Two Numbers Without Using Third Variable */
// a=10 b=20
// a=20 b=10

import java.util.Scanner;
class Swap 
{
    public static void main(String[] args) {

        int a,b;
        System.out.print("Enter any two Numbers ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();  // a=100
        b=r.nextInt();  // b=200
        System.out.println("Before Swapping "+a+" "+b);  //  100 200
        a=a+b;  // a=100+200=300
        b=a-b;  // b=300-200=100
        a=a-b;  // a=300-100=200
        System.out.println("After Swapping "+a+" "+b);  // 200  100
       
    }
}
