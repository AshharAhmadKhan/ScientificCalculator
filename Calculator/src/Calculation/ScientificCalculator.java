package Calculation;
import java.util.*;
public class ScientificCalculator
{
public static void main(String[] args) {
Scanner ob = new Scanner(System.in);
System.out.println("\nScientific Calculator Menu:");
System.out.println("1. Addition");
System.out.println("2. Subtraction");
System.out.println("3. Multiplication");
System.out.println("4. Division");
System.out.println("5. Sin");
System.out.println("6. Cos");
System.out.println("7. Tan");
System.out.println("8. Logarithm");
System.out.println("9. Natural Logarithm");
System.out.println("10. Exponentiation");
System.out.println("11. Square Root");
System.out.println("12. Exit");
System.out.print("Enter your choice: ");
int ch = ob.nextInt();
switch (ch) 
{
case 1:
System.out.print("Enter first number: ");
double a1 = ob.nextDouble();
System.out.print("Enter second number: ");
double a2 = ob.nextDouble();
System.out.println("Result: " + (a1+a2));
break;
case 2:
System.out.print("Enter first number: ");
double s1 = ob.nextDouble();
System.out.print("Enter second number: ");
double s2 = ob.nextDouble();
System.out.println("Result: " + (s1-s2));
break;
case 3:
System.out.print("Enter first number: ");
double m1 = ob.nextDouble();
System.out.print("Enter second number: ");
double m2 = ob.nextDouble();
System.out.println("Result: " + (m1*m2));
break;
case 4:
System.out.print("Enter dividend: ");
double d1 = ob.nextDouble();
System.out.print("Enter divisor: ");
double d2 = ob.nextDouble();
if (d2==0) 
System.out.println("Cannot divide by zero."); 
else 
System.out.println("Result: " + (d1/d2));
break;
case 5:
System.out.print("Enter angle in degrees: ");
double sin = ob.nextDouble();
System.out.println("Result: " + Math.sin(Math.toRadians(sin)));
break;
case 6:
System.out.print("Enter angle in degrees: ");
double cos = ob.nextDouble();
System.out.println("Result: " + Math.cos(Math.toRadians(cos)));
break;
case 7:
System.out.print("Enter angle in degrees: ");
double tan = ob.nextDouble();
System.out.println("Result: " + Math.tan(Math.toRadians(tan)));
break;
case 8:
System.out.print("Enter number: ");
double log = ob.nextDouble();
if (log<=0)
System.out.println("Invalid input. Logarithm is not defined for non-positive numbers.");
else 
System.out.println("Result: " + Math.log10(log));
break;
case 9:
System.out.print("Enter number: ");
double ln = ob.nextDouble();
if (ln<=0)
System.out.println("Invalid input. Natural logarithm is not defined for non-positive numbers.");
else
System.out.println("Result: " + Math.log(ln));
break;
case 10:
System.out.print("Enter base: ");
double b = ob.nextDouble();
System.out.print("Enter exponent: ");
double ex = ob.nextDouble();
System.out.println("Result: " + Math.pow(b,ex));
break;
case 11:
System.out.print("Enter number: ");
double n = ob.nextDouble();
if (n<0)
System.out.println("Invalid input. Square root is not defined for negative numbers.");
else
System.out.println("Result: " + Math.sqrt(n));
break;
case 12:
System.out.println("Exiting...");
ob.close();
System.exit(0);
default:
System.out.println("Invalid choice. Please try again.");
}
}
}

