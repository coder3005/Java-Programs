/* Tax calculation Program */
// input sal<=10000 ----> No tax
// input sal>10000 b/w sal<=100000 ----> 10% tax
// input sal>100000----> 20% tax

import java.util.Scanner;
class Tax
{
    public static void main(String[] args) {

        int sal; double tax;
        System.out.print("Enter Salary ");
        Scanner r=new Scanner(System.in);
        sal=r.nextInt();

        if(sal<=10000)
        {
            System.out.print(sal + " No Tax");
        }
        else if(sal>10000 && sal<=100000)
        {
            tax=sal*0.10;
            System.out.print(sal+" "+tax);
        }
        else
        {
            tax=sal*0.20;
            System.out.print(sal+" "+tax);
        }
    }
}
