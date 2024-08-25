import java.util.Scanner;
class task15
{
    static String getname(String name)
    {  
      return name;  
    }
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       System.out.print("Enter your Name:");
       String name=scan.nextLine();
       task15 obj1=new task15();
       String N=obj1.getname(name);
       System.out.println("Your Name is:"+N);
    }
}