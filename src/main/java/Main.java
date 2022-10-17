import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Calculator calc = new Calculator();
    System.out.println("Enter a command:");

    String func = scanner.next();
    int a = scanner.nextInt();

    if(func.equals("add")) {
      int b = scanner.nextInt();
      System.out.println(calc.add(a,b));

    }

    if(func.equals("subtract")) {
      int b = scanner.nextInt();
      System.out.println(calc.subtract(a,b));
    }

    if(func.equals("multiply")) {
      int b = scanner.nextInt();
      System.out.println(calc.multiply(a,b));
    }

    if(func.equals("divide")) {
      int b = scanner.nextInt();
      System.out.println(calc.divide(a,b))
    }

    if(func.equals("fib")) {
      System.out.println(calc.fibonacciNumberFinder(a));
    }

    if(func.equals("convert")) {
      System.out.println(calc.intToBinaryNumber(a));
    }
  }
}