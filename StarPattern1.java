/* Star Pattern Program */
class A 
{
    public static void main(String[] args) {
        
        int i,j;
        for(i=1;i<=5;i++)  // rows
        {
            for(j=5;j>=i;j--)  // columns
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
