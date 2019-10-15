import java.util.Scanner;
public class DissectingStrings{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    final int LENGTH = input.length();
    for (int i=0; i<LENGTH; i++){
      System.out.println(input.charAt(i));
    }
  }
}
