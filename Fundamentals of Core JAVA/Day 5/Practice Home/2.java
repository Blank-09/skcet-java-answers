import java.util.Scanner;

class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    int l = n * 2;

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {
        if (j <= i && j < l - i)
          System.out.print((i < n ? j + 1 : l - i) + " ");
      }
      System.out.println();
    }

    scanner.close();
  }
}
