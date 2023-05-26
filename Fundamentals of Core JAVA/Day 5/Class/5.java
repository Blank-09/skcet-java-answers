import java.util.Scanner;

class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    int l = n * 2 - 1;

    for (int i = 0; i < l; i++) {
      for (int j = 0; j < l; j++) {
        if (i + j < n || j - 1 <= i - n || j >= i + n - 1 || n <= j + i - l + 2)
          System.out.print("*  ");
        else
          System.out.print("   ");
      }
      System.out.println();
    }
    System.out.println();
  }
}