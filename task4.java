import java.util.Scanner;
class task3{
    public static void  main(String agrs[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Traffic light Color:");
        String light=scan.nextLine();
        if(light.equals("Red"))
        {
            System.out.println("Stop");
        }
        else if(light.equals("Yellow"))
        {
            System.out.println("Ready");
        }
        else if(light.equals("Green"))
        {
           System.out.println("Go"); 
        }
        else
        {
            System.out.println("Its not a Traffic light Color");
        }
    }
}