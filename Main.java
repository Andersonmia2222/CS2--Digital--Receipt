public class Main {
    public static void main (string[] args) {

System.out.println("**************************************");
System.out.println("*                                    *");
System.out.println("*     High School Snack Bar          *");
System.out.println("*                                    *");
System.out.println("*   Drink .......$1.50               *");
System.out.println("*   Candy .......$1.25               *");
System.out.println("*   Hot Dog .......$2.75             *");
System.out.println("*   Hamburger .......$3.50           *");
System.out.println("*                                    *");
System.out.println("**************************************");

    }
}

public class Main {
public static void main (String [] args) {

    String highSchoolName = "High School Snack Bar";
    double drinkPrice = 1.50; 
    double candyPrice = 1.25;
    double hotDogPrice = 2.75; 
    double hamburgerPrice = 3.50; 

    System.out.println("**************************************");
System.out.println("*                                    *");
System.out.println("*     " + highSchoolName + "          *");
System.out.println("*                                    *");
System.out.println("*   Drink ...... $" + drinkPrice + "              *");
System.out.println("*   Candy ...... $" + candyPrice + "              *");
System.out.println("*   Hot Dog ...... $" + hotDogPrice + "            *");
System.out.println("*   Hamburger ...... $" + hamburgerPrice + "       *");
System.out.println("*                                    *");
System.out.println("**************************************");

public class Main {
    public static void main(String [] args) {

String highSchoolName = "High School Snack Bar";
double drinkprice = 1.50;
double candyPrice = 1.25;
double hotDogPrice = 2.75;
double hamburgerprice = 3.50;


int orderNumber = (int)(Math.random() * 100) + 1;
int numDrinks = (int)(Math.random() * 3);
int numCandies = (int)(Math.random() * 3);
int numHotDogs = (int)(Math.random() * 3);
int numHamburgers = (int)(Math.random() * 3);

double taxRate = 0.07;
double subtotal = (numDrinks * drinkPrice) + (numCandies * candyPrice)
                    + (numHotDogs * hotDogPrice) + (numHamburgers * hamburgerPrice); 
double totalTax = subtotal * taxRate;
double total = subtotal + totalTax;







    }
}


 
}
}