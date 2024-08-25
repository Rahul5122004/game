import java.util.Scanner;
public class task12
{
    void total_money()
    {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter the Apple count:");
    int Apple_count=scan.nextInt();
    int Apple_price=20;
    System.out.print("The total amount:"+Apple_count*Apple_price);
    }
    public static void main(String args[])
    {
        task12 obj1=new task12();
        obj1.total_money();
    }
}