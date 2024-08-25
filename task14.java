import java.util.Scanner;
class task14
{
    static int Fstar(int money,int a)
    {
    System.out.println("Received Money:"+a);
    int remainder=a-money;
    return remainder;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Money you Given:");
        int a=scan.nextInt();
        task14 obj1=new task14();
        int rem=obj1.Fstar(5,a);
        System.out.println("5 Star chocolate is only Rs:5");
        System.out.println("Balance:"+rem);
    }
}