/* Area of Rectangle Program */
// input length
// input breadth
// formula length*breadth

import java.util.Scanner;
class Rectangle 
{
    public static void main(String[] args) {

        int length,breadth,Area;
        System.out.print("Enter Length ");
        Scanner r=new Scanner(System.in);
        length=r.nextInt();
        System.out.print("Enter Breadth ");
        breadth=r.nextInt();
        
        Area=length*breadth; 

        System.out.println("Area of Rectangle "+ Area);
    }
}
