/* Print Half-Diamond  Pattern */
class A 
{
    public static void main(String[] args) {
        
        int i,j;
        for(i=1;i<=5;i++)  // rows
        {
            for(j=1;j<=i;j++) // column
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        for(i=1;i<=4;i++)  // rows
        {
            for(j=4;j>=i;j--) // column
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
