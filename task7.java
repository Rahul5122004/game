import java.util.Scanner;
class task7{
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       int i;
       int evencount=0;
       for(i=1;i<=100;i++)
       {
        if(i%3==0&&i%5==0)
        {
          System.out.println(i);
        }
       }
    }
}
    
