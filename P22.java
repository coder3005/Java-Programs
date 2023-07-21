/* Eligible for Vote or Not */
// input age >=18 ---->vote
// input age<18 -----> not

import java.util.Scanner;
class Vote
{
    public static void main(String[] args) {

        int age;
        System.out.print("Enter Your Age ");
        Scanner r=new Scanner(System.in);
        age=r.nextInt();

        if(age>=18)
        {
            System.out.print("Eligible for Votes ");
        }
        else 
        {
            System.out.print("Not Eligible for Votes ");
        }
    }
}
