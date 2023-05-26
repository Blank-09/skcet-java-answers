import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        if (j == 0 || i == n - 1 || i == j)
          System.out.print('*');
        else
          System.out.print(' ');
      }
      System.out.println();
    }

    scanner.close();
  }
}