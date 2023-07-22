/* Area of Square Program */
// input side
// formula side*side

import java.util.Scanner;
class Square
{
    public static void main(String[] args) {

        int side,Area;
        System.out.print("Enter Side ");
        Scanner r=new Scanner(System.in);
        side=r.nextInt();
        
        Area=side*side; 

        System.out.println("Area of Square "+ Area);
    }
}
