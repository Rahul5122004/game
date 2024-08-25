public class task13
{
    static void calculation(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition of a and b:"+c);
        int d=a-b;
        System.out.println("Subtraction of a and b:"+d);
        int e=a*b;
        System.out.println("Multiplication of a and b:"+e);
        int f=a/b;
        System.out.println("Division of a and b:"+f);
    }
    public static void main(String args[])
    {
        calculation(20,10);
    }
}