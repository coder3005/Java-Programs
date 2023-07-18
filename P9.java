/* Print Even Numbers In Given Range */
import java.util.Scanner;
class Even
{
    public static void main(String[] args) {
         
        int n;
        System.out.print("Enter No. of Terms ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        for(int i=0;i<=n;i=i+2)
        {
            System.out.print(i+" ");
        }
    }
}
