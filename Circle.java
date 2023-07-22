/* Area of Circle Program */
// input radius
// formula pie*r*r
// pie=22/7 or 3.14

import java.util.Scanner;
class Circle 
{
    public static void main(String[] args) {

        int radius; double Area,pie=3.14;
        System.out.print("Enter Radius ");
        Scanner r=new Scanner(System.in);
        radius=r.nextInt();
        
        Area=pie*radius*radius; 

        System.out.println("Area of Circle "+ Area);
    }
}
