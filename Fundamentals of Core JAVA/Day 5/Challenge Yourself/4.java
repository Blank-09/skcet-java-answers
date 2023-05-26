import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int l = n * 2 - 1;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n + i; j++) {
        if (n - i <= j + 1)
          System.out.print((char) (i + j - n + 1 + 'A'));
        else
          System.out.print(" ");
      }
      System.out.println();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; i + j < l; j++) {
        if (i <= j)
          System.out.print((char) (j - i + 'A'));
        else
          System.out.print(" ");
      }
      System.out.println();
    }

    scanner.close();
  }
}