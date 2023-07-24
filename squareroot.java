/* Find square root of a Number */
// input number 25 ----> 5

import java.util.Scanner;
class square
{
    public static void main(String[] args) {
        
        int n;
        System.out.print("Enter any number ");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        double m=Math.sqrt(n);
        System.out.print("Square root of "+n+" is "+m);
    }
}
