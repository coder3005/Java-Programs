/* Print Number Pattern */
class A 
{
    public static void main(String[] args) {
        
        int i,j;
        for(i=1;i<=5;i++) // rows
        {
            for(j=1;j<=i;j++)  // column
            {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
