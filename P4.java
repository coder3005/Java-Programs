/* Odd Even Program */
import java.util.Scanner;
class OddEven
{
    public static void main(String[] args) {

        int n;
        System.out.print("Enter any Number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if(n%2==0)
        {
            System.out.print("Even Number");
        }
        else
        {
            System.out.print("Odd Number");
        }
    }
}
