import java.util.Scanner;
 class task10
{
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      int num;
      do
      {
      System.out.print("Enter the Number > 10:");
      num=scan.nextInt();
      }
      while(num < 10);
    }
}
