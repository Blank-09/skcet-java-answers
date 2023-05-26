import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.print(" "); // Initial Space

      for (int j = 0; j < n; j++) {
        if (i <= j)
          System.out.print("* ");
        else
          System.out.print(" ");
      }

      System.out.println();
    }
    scanner.close();
  }
}