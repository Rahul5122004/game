import java.util.Scanner;
class task16
{
    static void evenodd(int num)
    {  
       if(num%2==0)
       {
        System.out.println(num+" is a Even Number");
       }
       else
       {
        System.out.println(num+" is a Odd Number");
       }
    }
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter a Number:");
       int num=scan.nextInt();
       task16 obj1=new task16();
       obj1.evenodd(num);
    }
}