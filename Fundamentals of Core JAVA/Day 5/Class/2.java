import java.util.Scanner;

class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print((i + j + 1) % 2 + " ");
      }
      System.out.println();
    }
  }
}