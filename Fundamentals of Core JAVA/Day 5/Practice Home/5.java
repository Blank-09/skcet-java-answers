import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int l = n * 2 - 1;

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {
        if (j == n - 1 || i == n - 1)
          System.out.print('*');
        else if (j < n)
          System.out.print(' ');
      }
      System.out.println();
    }

    scanner.close();
  }
}