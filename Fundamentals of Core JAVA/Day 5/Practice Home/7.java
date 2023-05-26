import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
 
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < n; j++) {
        if (i + j >= n)
          System.out.print("* ");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i + j >= n - 1)
          System.out.print("* ");
        else
          System.out.print(" ");
      }
      System.out.println();
    }

    scanner.close();
  }
}