import java.util.Scanner;
class task2{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your mark :");
        int mark =scan.nextInt();
        if(mark>=80)
        {
            System.out.println("Very Good");
        }
        else if(mark>=60)
        {
            System.out.print("Good");
        }
        else if(mark==35 || mark>35 && mark<60)
        {
            System.out.print("You need to im prove");
        }
        else
        {
            System.out.print("Fail");
        }
    }
}