import java.util.Scanner;
class task6{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n=scan.nextInt();
        int i;
        for(i=n;i>=0;i=i-1)
        {
            System.out.println(i);
        }
    }
}