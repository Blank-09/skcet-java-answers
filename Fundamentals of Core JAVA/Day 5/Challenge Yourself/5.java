import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int w = n * 2 - 1; // total width
    int h = (int) Math.ceil(n / 4.0); // trapezium height
    int tw = n / 2; // trapezium top width
    int b = (n % 4 == 3 || n % 4 == 0) ? 1 : 0; // Shift Balance condition
    int s = 2 * ((n + 1) / 4); // sequence 0,0,2,2,2,2,4,4,4,4,6... (where n is Natural no.)

    /*
     * This Code is written with some knowledge of
     * Geometry, 2D graphics and trial & error.
     * 
     * So you may not understand this completely.
     */

    // Upper two Trapezium (triangle top cut in half)
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        // First Trapezium
        if ((i + 1 >= h - j + b) && (tw + h + i > j - b + 1))
          System.out.print((char) (i + j - h + 1 - b + 'A'));

        // Second Trapezium
        else if ((i + 1 >= n + h + b - j && n + i > j - h - tw + 1 - b))
          System.out.print((char) (i + j - h - tw - s + 'A'));

        else if (j + 1 <= n + h + b - i)
          System.out.print(' ');
      }
      System.out.println();
    }

    // Lower Inverted Triangle
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < w - i; j++) {
        if (i <= j)
          System.out.print((char) (j - i + 'A'));
        else
          System.out.print(' ');
      }
      System.out.println();
    }

    scanner.close();
  }
}