import java.util.Scanner;
public class Main {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("enter amount of drinks");
  int drinkCount = input.nextInt();
  System.out.println("enter amount of candys");
  int candyCount = input.nextInt();
  System.out.println("enter amount of hotdogs");
  int hotdogCount = input.nextInt();
  System.out.println("enter amount of burgers");
  int hamburgerCount = input.nextInt();

  input.nextLine();
   System.out.println("enter high school name");
   String highSchoolName = input.nextLine();
   String initials = "BWL";

   double priceDrink = 3.00;
   double priceCandy = 1.00;
   double priceHotDog = 3.00;
   double priceHamburger = 8.25;

   int orderNumber = (int) (Math.random()*10);
   int numberDrink = drinkCount;
   int numberCandy = candyCount;
   int numberHotDog = hotdogCount;
   int numberHamburger = hamburgerCount;

   double taxRate = 0.07;
   double subtotal = priceDrink*numberDrink+priceCandy*numberCandy+priceHotDog*numberHotDog+priceHamburger*numberHamburger;
   double taxTotal = subtotal*taxRate;
   double total = subtotal+taxTotal;
   
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*         "+ initials + " Snack Bar              *");
     System.out.println("*                                    *");
     System.out.println("*     Order #"+ orderNumber + "                       *");
     System.out.println("*     Drink .......... $"+ priceDrink + " #" + drinkCount + "      *");                      
     System.out.println("*     Candy .......... $"+ priceCandy + " #" + candyCount + "      *");     
     System.out.println("*     Hot Dog ........ $"+ priceHotDog + " #" + hotdogCount + "      *");     
     System.out.println("*     Hamburger ...... $"+ priceHamburger + " #" + hamburgerCount + "      *");     
     System.out.println("*                                    *"); 
     System.out.println("*        Total ...... $"+ subtotal +"         *");
     System.out.println("**************************************");
  }
}
