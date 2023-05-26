import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int l = n * 2 - 1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < l; j++) {
        if (i + j >= n - 1 && i + j < l)
          System.out.print('*');
        else if (i + j < l)
          System.out.print(' ');
      }
      System.out.println();
    }

    scanner.close();
  }
}