import java.util.Scanner;
public class DigitScanner{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Mega Star Printer X3000");
    boolean integerValid = false;
    String multipleInput = "";
    while (multipleValid == false){
      System.out.println("Input all multiples of:");
      multipleInput = scan.nextLine();
      for (int i=0; i<multipleInput.length(); i++){
        if (multipleInput.codePointAt(i)<48 || multipleInput.codePointAt(i)>57){
          System.out.println("error: must be a non-decimal positive integer");
          break;
        } else if(i == multipleInput.length()-1){
          multipleValid = true;
        }
      }
    }
    int multiple = Integer.parseInt(multipleInput);

  }
}
