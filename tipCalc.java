import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your meal price");;
        double meal = input.nextDouble();
        
        System.out.println("What percentage would you like to tip?");
        double srv = input.nextDouble();
        
        double tip = meal * (srv/100);
        System.out.println("tip amount: " + tip);
        
        double total = tip + meal;
        System.out.println("total "+ total);
    }
}