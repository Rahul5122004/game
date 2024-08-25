import java.util.Scanner;
class task1{
    public static void  main(String agrs[])
    {
        Scanner scan=new Scanner(System.in);
        String Meena=scan.nextLine();
        if(Meena.equals("Dead"))
        {
            System.out.println("Surya meets Meenu");
        }
        else
        {
             System.out.println("Surya weds Meena");
        }
    }
}