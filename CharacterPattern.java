/* Print Character  Pattern */
class A 
{
    public static void main(String[] args) {
        
        char i,j;
        for(i='A';i<='E';i++)  // rows, in place of A and E we can write 65 and 69 respectively, will give same result
        {
            for(j='A';j<=i;j++)  // column
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
