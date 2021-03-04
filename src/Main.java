public class Main {

  public static void main(String[] args) {
    System.out.println("factorial(2) = " + factorial(2));
    System.out.println("factorial(10) = " + factorial(10));
    System.out.println("fibonacci(2) = " + fibonacci(2));
    System.out.println("fibonacci(10) = " + fibonacci(10));
    System.out.println("sequence1(2) = " + sequence1(2));
    System.out.println("sequence1(10) = " + sequence1(10));
    System.out.println("sequence2(2) = " + sequence2(2));
    System.out.println("sequence2(10) = " + sequence2(10));
    System.out.println("hofsQ(2) = " + hofsQ(2));
    System.out.println("hofsQ(10) = " + hofsQ(10));
        System.out.println("tetration(2, 3) = " + tetration(2, 3));
        System.out.println("tetration(3, 2) = " + tetration(3, 2));
        System.out.println("tetration(3, 3) = " + tetration(3, 3));
  }

  public static double factorial(double n) {
    if (n == 0) {
      return 1;
      //The factorial of 0 is 1.
    } else {
      return n * factorial(n - 1);
    }
  }


    public static double fibonacci ( double n){
    if (n < 2) {
      return n;
      //Anything less than 2 is 1 and 0. If n is 1 the return will be 1, if n is 0 the return will be 0
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static double sequence1(double n){
      if (n < 2) {
        return 2;
      } else {
        return 2 * sequence1(n - 1) - 1;
      }
    }

  public static double sequence2(double n) {
    if (n < 2) {
      return 5;
    } else {
      return 3 * sequence2(n - 1);
    }
  }

  public static double hofsQ(double n){
        if (n < 3) {
          return 1;
        } else {
          return hofsQ(n - hofsQ(n - 1) + hofsQ(n - hofsQ(n - 2)));
        }
      }

  public static double tetration(double a, double n) {
    // your code goes here
    // return 0 is a placeholder you must replace it
    return 0;
  }

  // your chosen math sequence goes here
}

