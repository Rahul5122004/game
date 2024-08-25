import java.util.Scanner;
 class task9
{
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter the Number:");
      int n=scan.nextInt();
      int i,j,k;
      for(i=1;i<=n;i++)
      {
        for(k=1;k<=n-i;k++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
        System.out.print("* ");
        }
        System.out.println(" ");
      }
    }
}
