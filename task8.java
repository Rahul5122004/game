import java.util.Scanner;
class task8
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int[] marks=new int[size];
        int i;
        for(i=0;i<size;i++)
        {
            marks[i]=scan.nextInt();
        }
    }
} 
