import java.util.Scanner;

class Main {

  public static Scanner scanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    int n = scanner.nextInt();

    if (n % 2 == 0) {
      System.out.println("Enter ODD number of rows");
      return;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j <= i && j < n - i)
          System.out.print((i+1) * (j+1) + " ");
      }
      System.out.println();
    }

    scanner.close();
  }
}
