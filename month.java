/* Enter month number & print number of days in a month */
// input month number 1 ----> January=31 Days 

import java.util.Scanner;
class month 
{
    public static void main(String[] args) {
        
        int n;
        System.out.print("Enter month number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        switch(n)  // we can also use if else ladder
        {
            case 1: System.out.print("January=31 Days");
            break;
            case 2: System.out.print("Februray=28 Days");
            break;
            case 3: System.out.print("March=31 Days");
            break;
            case 4: System.out.print("April=30 Days");
            break;
            case 5: System.out.print("May=31 Days");
            break;
            case 6: System.out.print("June=30 Days");
            break;
            case 7: System.out.print("July=31 Days");
            break;
            case 8: System.out.print("August=31 Days");
            break;
            case 9: System.out.print("September=30 Days");
            break;
            case 10: System.out.print("October=31 Days");
            break;
            case 11: System.out.print("November=30 Days");
            break;
            case 12: System.out.print("December=31 Days");
            break;
            default: System.out.print("Invalid month number");
            break;
            
        }
    }
}
