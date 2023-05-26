import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int l = n * 2 - 1;

    for (int i = 0; i < l; i++) {
      for (int j = 0; j <= l; j++) {
        if ((i >= j && l - i > j) || (i < j && l - i <= j))
          System.out.print('*');
        else
          System.out.print(' ');
      }
      System.out.println();
    }

    scanner.close();
  }
}