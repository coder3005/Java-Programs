/* Print character in Java */
// input 10--->10
// input A---->A

import java.util.Scanner;
class charPrint
{
    public static void main(String[] args) {

        char ch;
        System.out.print("Please Enter Character ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        System.out.print(ch);
    }
}
