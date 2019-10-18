import java.util.Scanner;
public class DigitScanner{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Input an integer:");
    String input = scan.nextLine();
    final int LENGTH = input.length();
    int countOdd = 0;
    int countEven = 0;
    int countZero = 0;
    for (int i=0; i<LENGTH; i++){
      int digit = input.charAt(i);
      if (digit == 0){
        countZero++;
      } else if (digit%2 == 1){
        countOdd++;
      } else{
        countEven++;
      }
    }
    System.out.println("Odds: "+countOdd);
    System.out.println("Evens: "+countEven);
    System.out.println("Zeros: "+countZero);
    
  }
}
