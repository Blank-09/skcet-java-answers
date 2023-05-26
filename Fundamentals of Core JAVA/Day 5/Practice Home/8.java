import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int l = n * 2 - 1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < l; j++) {
        if (i == 0 || i == j || l - i == j + 1)
          System.out.print('*');
        else if (i < j && l - i > j)
          System.out.print('i');
        else 
          System.out.print('b');

      }
      System.out.println();
    }

    scanner.close();
  }
}