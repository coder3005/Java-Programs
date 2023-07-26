/* Print Number Pattern */
class A 
{
    public static void main(String[] args) {
        
        int i,j,count=0;
        for(i=1;i<=5;i++) // rows
        {
            for(j=1;j<=i;j++)  // column
            {
                count++;
                System.out.print(count+" ");
            }
            System.out.print("\n");
        }
    }
}
