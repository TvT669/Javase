public class for03 {
  public static void main(String[] args) {
    for (int i = 0; i <= 9; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i + "*" + j + "=" + i * j + " ");
      }
      System.out.println();
    }

  }
}