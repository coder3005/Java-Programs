/* Area of Triangle Program */
// input side
// formula 0.5*base*height

import java.util.Scanner;
class Triangle 
{
    public static void main(String[] args) {

        int base,height; Double Area;
        System.out.print("Enter Base ");
        Scanner r=new Scanner(System.in);
        base=r.nextInt();
        System.out.print("Enter Height ");
        height=r.nextInt();
       
        Area=0.5*base*height; 

        System.out.println("Area of Triangle "+ Area);
    }
}
