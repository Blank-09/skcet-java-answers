import java.util.Scanner;

class Main {
  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    String str = scanner.next();
    int length = str.length();

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if (i == j)
          System.out.print(str.charAt(i));
        else if (i == length - j - 1)
          System.out.print(str.charAt(length - i - 1));
        else
          System.out.print(' ');
      }
      System.out.println();
    }

    scanner.close();
  }
}