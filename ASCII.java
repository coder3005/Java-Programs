/* Print ASCII value of character */
// input A ---> 65

import java.util.Scanner;
class ASCII
{
    public static void main(String[] args) {

        char ch;
        System.out.print("Enter any Character ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);

        int a=ch;
        System.out.print("ASCII value of "+ch +" is "+ a);
    }
}
