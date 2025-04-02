package Product;
import java.util.Scanner;

public class Product_Run 
{
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        int x = 0; 
        double y;
        double min = 1000000000;

        Product p = new Product();

        System.out.println("Do you want to enter product prices ?? (Yes=1/No=0)");
        x = userInput.nextInt();
        if(x == 0 )
        {
            System.exit(0);
        }

        while(x == 1)
        {
            System.out.println("Give the price of the product");
            y = userInput.nextDouble();
            while(y<0)
            {
                System.out.println("The price you gave isnt valid, please enter a valid one");
                y = userInput.nextDouble();
            }
            p.set(y);
            if(p.get() < min)
            {
                min = p.get();
            }
            System.out.println("Do you wish to enter the price of another product ?? (Yes=1/No=0)");
            x = userInput.nextInt();
            while(x != 1 && x!= 0)
            {
                System.out.println("The answer you entered is invalid, please enter a valid one (Yes=1/No=0)");
                x = userInput.nextInt();
            }
        }

        System.out.println("The smallest product price is : " + min);
    }   
}
