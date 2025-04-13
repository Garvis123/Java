import java.util.Scanner;

public class Javabasic {

  public boolean isPalindrome(int x) {
    int reverse=0;
    int b=x;
    while(x>0)
    {
        int last = x%10;
        reverse=last + (reverse*10);
        x=x/10;
      }
      if(reverse=b)
      {
          return true;
      }
}
    public static void main(String[] args) {
      int x=121;
      isPalindrome(x);
  }
}
