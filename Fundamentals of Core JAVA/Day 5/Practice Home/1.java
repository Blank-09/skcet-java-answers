import java.util.Scanner;

class Main {
  public static  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();

    if (n <= 1) {
      System.out.println("You cannot generate christmas tree");
      return;
    }

    if (n > 20) {
      System.out.println("Tree is no more");
      return;
    }

    // Top Part or First Triangle
    int m = n + 1;
    int l = m * 2 - 1;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < i + m; j++) {
        if (m + i > j && m - i <= j + 1)
          System.out.print('*');
        else
          System.out.print(' ');
      }
      System.out.println();
    }

    /**
     * Middle Parts (Smaller Triangles)
     * 
     * Here the second triangle will be bigger
     * than the rest of the following triangles
     */
    for (int k = 0; k < n - 2; k++) {
      // When k = 0, meaning the second triangle
      // will be larger than the others
      int a = (k == 0 ? 1 : 2);
      for (int i = 0; i < n - a; i++) {
        for (int j = 0; j < l; j++) {
          if (n - i <= j + 1 && i + n > j - 2)
            System.out.print('*');
          else
            System.out.print(' ');
        }
        System.out.println();
      }
    }

    // Part: Bottom Stand when n < 20
    for (int i = 0; i < 2 && n < 20; i++) {
      for (int j = 0; j < l; j++) {
        if (j == n)
          System.out.print('*');
        else
          System.out.print(' ');
      }
      System.out.println();
    }

    // Fat Bottom Stand when n == 20
    for (int i = 0; i < 5 && n == 20; i++) {
      for (int j = 0; j < l; j++) {
        if (n - i <= j + 1 && i + n > j - 2)
          System.out.print('*');
        else
          System.out.print(' ');
      }
      System.out.println();
    }

    scanner.close();
  }
}