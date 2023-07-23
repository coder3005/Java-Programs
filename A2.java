/* Predict Output of Program */
class A
{
    public static void main(String[] args) {
        int sum=0;
        for(int i=0,j=0; i<5 && j<5; ++i, j=i+1)
        {  // if we remove this curly bracket then according to last condition output will be print
            sum=sum+i;
            System.out.print(sum);
        }
    }
}
