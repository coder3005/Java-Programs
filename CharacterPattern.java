/* Print Character  Pattern */
class A 
{
    public static void main(String[] args) {
        
        char i,j;
        for(i='A';i<='E';i++)  // rows
        {
            for(j='A';j<=i;j++)  // column
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
