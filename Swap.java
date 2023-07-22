/* Swap of Two Numbers */
// Ram ----> 10  Syam ----> 20
// Ram ----> 20 <--> Raju <---> Syam ----> 10

import java.util.Scanner;
class Swap
{
    public static void main(String[] args) {

        int a,b,temp;
        System.out.print("Enter two Numbers ");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();  // 100
        b=r.nextInt();  // 200
        System.out.println("Before Swapping "+ a+" "+b);  // 100  200

        temp=a;  // temp=100
        a=b;    // a=200
        b=temp; // b=100
        System.out.print("After Swapping "+ a+" "+b);  // 200 100

    }
}
