/* Print Odd Numbers In Given Range */
import java.util.Scanner;
class Odd
{
    public static void main(String[] args) {
         
        int n;
        System.out.print("Enter No. of Terms ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=1;i<=n;i=i+2)
        {
            System.out.print(i+" ");
        }
    }
}
