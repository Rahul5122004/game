import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name=scan.nextLine();
         System.out.print("Enter your Age: ");
        int age=scan.nextInt();
         System.out.print("Enter your Score: ");
        Double score=scan.nextDouble();
        scan.nextLine();
         System.out.print("Enter your Address: ");
        String address=scan.nextLine();
        System.out.println("My Name is:"+name);
        System.out.println("My Age is:"+age);
        System.out.println("My Score is:"+score/10+"/10");
        System.out.print("My Address:"+address);
    }
}