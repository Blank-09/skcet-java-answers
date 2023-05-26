import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char ch = scanner.next().charAt(0);

    int n = ch - 'A' + 1;
    int l = n * 2 - 1;

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {
        if ((i == j + n - 1) || (n - i == j + 1) ||
            (i + 1 == l + n - j - 1) || (n + i == j + 1)
        )
          System.out.print((char) ((i < n ? i : l - i - 1) + 'A'));
        else if ((i + 1 < l + n - j - 1) && (n + i > j + 1))
          System.out.print(' ');
      }
      System.out.println();
    }

    scanner.close();
  }
}