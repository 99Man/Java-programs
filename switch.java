import java.util.Scanner;

public class switch 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>56)
        {
            System.out.println("You are old for the JOb");
        }
        else if(age>46)
        {
            System.out.println("We need Experience Man");
        }
        else if(age>36)
        {
            System.out.println("30+ is eligible for the job");
        }
        else(age>26)
        {
            System.out.println("You are too young for the JOb");
        }
    }
}
