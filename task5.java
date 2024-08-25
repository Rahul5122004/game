import java.util.Scanner;
class task5{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the first Number:");
        int number1=scan.nextInt();
        System.out.print("Enter the second Number:");
        int number2=scan.nextInt();
        String result=(number1>number2)?"First Number is a Biggest Number":"Second Number is a Biggest Number";
        System.out.print("The Biggest Number is:"+result);
    }
}