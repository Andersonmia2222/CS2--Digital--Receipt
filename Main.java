import java.util.Scanner;
public class Main {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("enter amount of drinks");
  int xdrink = input.nextInt();
  System.out.println("enter amount of candys");
  int xcandy = input.nextInt();
  System.out.println("enter amount of hotdogs");
  int xhotdog = input.nextInt();
  System.out.println("enter amount of burgers");
  int xhamburger = input.nextInt();

  input.nextLine();
   System.out.println("enter high school name");
   String highSchoolName = input.nextLine();
   String initials = "BWL";

   double priceDrink = 3.00;
   double priceCandy = 1.00;
   double priceHotDog = 3.00;
   double priceHamburger = 8.25;

   int orderNumber = (int) (Math.random()*10);
   int numberDrink = xdrink;
   int numberCandy = xcandy;
   int numberHotDog = xhotdog;
   int numberHamburger = xhamburger;

   double taxRate = 0.08;
   double subtotal = priceDrink*numberDrink+priceCandy*numberCandy+priceHotDog*numberHotDog+priceHamburger*numberHamburger;
   double taxTotal = subtotal*taxRate;
   double total = subtotal+taxTotal;
   
     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*         "+ initials + " Snack Bar              *");
     System.out.println("*                                    *");
     System.out.println("*     Order #"+ orderNumber + "                       *");
     System.out.println("*     Drink .......... $"+ priceDrink + " #" + xdrink + "      *");                      
     System.out.println("*     Candy .......... $"+ priceCandy + " #" + xcandy + "      *");     
     System.out.println("*     Hot Dog ........ $"+ priceHotDog + " #" + xhotdog + "      *");     
     System.out.println("*     Hamburger ...... $"+ priceHamburger + " #" + xhamburger + "      *");     
     System.out.println("*                                    *"); 
     System.out.println("*        Total ...... $"+ subtotal +"         *");
     System.out.println("**************************************");
  }
}
