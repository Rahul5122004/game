import java.util.Scanner;
class task3{
    public static void  main(String agrs[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Five Subject Mark:");
        int Mark1=scan.nextInt();
        int Mark2=scan.nextInt();
        int Mark3=scan.nextInt();
        int Mark5=scan.nextInt();
        int Mark6=scan.nextInt();
        int Total=Mark1+Mark2+Mark3+Mark5+Mark6;
        System.out.println("Total:"+Total);
        int Average=Total / 5;
        System.out.println("Average:"+Average);
        if(Average>35)
        {
            System.out.println("You are good to Go");
        }
        else
        {
            System.out.println("Addition Class is required");
        }
    }
}