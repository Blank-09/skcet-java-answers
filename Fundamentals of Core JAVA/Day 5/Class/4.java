import java.util.Scanner;

class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    int l = n * 2 - 1;

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {
        if (i == j || i == l - j - 1 || i == 0 || j == 0 || i == l - 1 || j == l - 1)
          System.out.print(" * ");
        else
          System.out.print("   ");
      }
      System.out.println();
    }
  }
}