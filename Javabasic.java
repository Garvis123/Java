public class Javabasic {

  public static boolean isPalindr(int x) {
    int reverse = 0;
    int b = x;
    while (x > 0) {
      int last = x % 10;
      reverse = last + (reverse * 10);
      x = x / 10;
    }
    return reverse == b;
  }

  public static void main(String[] args) {
    int x = 121;
    System.out.println(isPalindr(x));  // ✅ Works now
  }
}
