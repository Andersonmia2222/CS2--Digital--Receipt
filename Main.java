import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

private static final int BOX_WIDTH = 38; // total asterisks across (matches starter)

private static String money(double v) {
return NumberFormat.getCurrencyInstance(Locale.US).format(v);
    }
private static String boxLine(String text) {
int interior = BOX_WIDTH - 2;
 if (text.length() > interior) text = text.substring(0, interior);
 StringBuilder sb = new StringBuilder("*");
sb.append(text);
while (sb.length() < BOX_WIDTH - 1) sb.append(" ");
sb.append("*");
return sb.toString();
    }

 private static void boxBorder() {
System.out.println(repeat("*", BOX_WIDTH));
    }

private static String repeat(String s, int n) {
return s.repeat(Math.max(0, n));
    }

private static String menuItem(String name, double price) {
 String left = "     " + name + " ";
String dots = "..........";
String priced = money(price);
String inner = left + dots + priced;
int interior = BOX_WIDTH - 2;
if (inner.length() > interior) inner = inner.substring(0, interior);
return boxLine(inner + repeat(" ", Math.max(0, interior - inner.length())));
    }

private static String orderItem(int qty, String name, double price) {
String inner = String.format("  %d x %s @ %s = %s", qty, name, money(price), money(qty * price));
int interior = BOX_WIDTH - 2;
if (inner.length() > interior) inner = inner.substring(0, interior);
return boxLine(inner + repeat(" ", Math.max(0, interior - inner.length())));
    }

private static void blankLine() {
System.out.println(boxLine(" ".repeat(BOX_WIDTH - 2)));
    }

private static String initialsOf(String fullName) {
String[] parts = fullName.trim().split("\\s+");
StringBuilder sb = new StringBuilder();
for (String p : parts) {
            if (!p.isEmpty()) sb.append(Character.toUpperCase(p.charAt(0)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {

System.out.println("\nPART A: Basic Receipt");
 System.out.println("Running the starter-style printout...");

System.out.println("**************************************");
System.out.println("*                                    *");
System.out.println("*     High School Snack Bar          *");
System.out.println("*                                    *");
System.out.println("*     Drink ..........$1.50          *");
System.out.println("*     Candy ..........$1.25          *");
System.out.println("*     Hot Dog ........$2.75          *");
System.out.println("*     Hamburger ......$3.50          *");
System.out.println("*                                    *");
System.out.println("**************************************");

System.out.println("\nPART B: Enhanced Receipt (variables)");
String highSchoolName = "Birch Wathen Lenox High School";
double drinkPrice = 1.50;
double candyPrice = 1.25;
double hotDogPrice = 2.75;
double hamburgerPrice = 3.50;

boxBorder();
System.out.println(boxLine(" ".repeat(BOX_WIDTH - 2)));
System.out.println(boxLine("     " + highSchoolName + " Snack Bar"));
System.out.println(boxLine(" ".repeat(BOX_WIDTH - 2)));
System.out.println(menuItem("Drink",     drinkPrice));
System.out.println(menuItem("Candy",     candyPrice));
System.out.println(menuItem("Hot Dog",   hotDogPrice));
System.out.println(menuItem("Hamburger", hamburgerPrice));
System.out.println(boxLine(" ".repeat(BOX_WIDTH - 2)));
        boxBorder();

System.out.println("\nPART C: Random Order (0–2 of each item, order # 1–100)");

int orderNumber = (int)(Math.random() * 100) + 1;        // 1–100 inclusive
int qDrinks     = (int)(Math.random() * 3);              // 0–2 inclusive
int qCandies    = (int)(Math.random() * 3);
int qHotDogs    = (int)(Math.random() * 3);
int qBurgers    = (int)(Math.random() * 3);

double taxRate = 0.08875; // example NYC sales tax; adjust if your class uses a different one

double sub = qDrinks * drinkPrice
         + qCandies * candyPrice
        + qHotDogs * hotDogPrice
     + qBurgers * hamburgerPrice;
 double tax = sub * taxRate;
double total = sub + tax;

boxBorder();
blankLine();
System.out.println(boxLine("     " + highSchoolName + " Snack Bar"));
System.out.println(boxLine("     Order #: " + orderNumber));
blankLine();
System.out.println(orderItem(qDrinks,  "Drink",     drinkPrice));
System.out.println(orderItem(qCandies, "Candy",     candyPrice));
System.out.println(orderItem(qHotDogs, "Hot Dog",   hotDogPrice));
System.out.println(orderItem(qBurgers, "Hamburger", hamburgerPrice));
blankLine();
System.out.println(boxLine(String.format("  Subtotal: %s", money(sub))));
System.out.println(boxLine(String.format("  Tax (%.3f): %s", taxRate, money(tax))));
System.out.println(boxLine(String.format("  Total: %s", money(total))));
blankLine();
boxBorder();

System.out.println("\nPART D: Interactive Receipt (your turn!)");
Scanner input = new Scanner(System.in);

System.out.print("Enter number of drinks: ");
int uDrinks = Integer.parseInt(input.nextLine().trim());

System.out.print("Enter number of candies: ");
int uCandies = Integer.parseInt(input.nextLine().trim());

System.out.print("Enter number of hot dogs: ");
int uHotDogs = Integer.parseInt(input.nextLine().trim());

System.out.print("Enter number of hamburgers: ");
int uBurgers = Integer.parseInt(input.nextLine().trim());

System.out.print("Enter your full high school name: ");
String schoolFull = input.nextLine().trim();
if (schoolFull.isEmpty()) schoolFull = highSchoolName; // fallback
String schoolInitials = initialsOf(schoolFull);

double uSub = uDrinks * drinkPrice
+ uCandies * candyPrice
+ uHotDogs * hotDogPrice
+ uBurgers * hamburgerPrice;
double uTax = uSub * taxRate;
double uTotal = uSub + uTax;

int uOrderNumber = (int)(Math.random() * 100) + 1;

boxBorder();
blankLine();
System.out.println(boxLine("     " + schoolInitials + " Snack Bar"));
System.out.println(boxLine("     Order #: " + uOrderNumber));
blankLine();
System.out.println(orderItem(uDrinks,  "Drink",     drinkPrice));
System.out.println(orderItem(uCandies, "Candy",     candyPrice));
System.out.println(orderItem(uHotDogs, "Hot Dog",   hotDogPrice));
System.out.println(orderItem(uBurgers, "Hamburger", hamburgerPrice));
blankLine();
System.out.println(boxLine(String.format("  Subtotal: %s", money(uSub))));
System.out.println(boxLine(String.format("  Tax (%.3f): %s", taxRate, money(uTax))));
System.out.println(boxLine(String.format("  Total: %s", money(uTotal))));
blankLine();
boxBorder();

input.close();
    }
}