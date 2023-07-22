/* Convert character Lower to Upper & vice-versa */
// input a to z ---> Uppercase
// input A to Z ----> Lowercase

import java.util.Scanner;
class Convert 
{
    public static void main(String[] args) {

        char ch,ch2;
        System.out.print("Enter any character ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            ch2=Character.toLowerCase(ch);
            System.out.print("LowerCase "+ ch2);
        } 
        else
        {
            ch2=Character.toUpperCase(ch);
            System.out.print("UpperCase "+ ch2);
        }
    }
}
