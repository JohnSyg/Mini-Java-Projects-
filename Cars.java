import java.util.Scanner;

public class Cars
{
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        
        double total_km = 0 , max_km , total_consumption = 0;
        double[] km;
        double[] consumption;
        int i =0 , input , counter = 0;

        km = new double[1000];

        do
        {
            System.out.println("Give the distance that the car covered \n");
            km[i] = userInput.nextDouble();
            i++;
            counter++;

            System.out.println("Do you want to give the next car information ?? Yes(1)/No(0) \n");
            input = userInput.nextInt();

            while(input!= 1 && input!=0)
            {
                System.out.println("The aswer you entered is not valid please enter a valid ansewr, Yes(1)/No(0)");
                input = userInput.nextInt();
            }

        }while(input == 1);

        max_km = km[0];
        consumption = new double[counter];

        for(i=0; i<counter; i++)
        {
            consumption[i] = (km[i]*6.5/100)*1.538;
            total_km += km[i];
            total_consumption += consumption[i];

            if(km[i] > max_km)
            {
                max_km = km[i];
            }
        }

        System.out.printf("The total distance that the car traveled is : %f \n" , total_km);
        System.out.printf("The total consumption that the cars have is : %f \n" , total_consumption);
        System.out.printf("The maximum distance one of the cars traveled is : %f \n" , max_km);
    }
}