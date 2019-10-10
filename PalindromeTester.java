import java.util.Scanner;
public class PalindromeTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    input = input.toLowerCase();
    int length = input.length();
    System.out.println(input+" "+length);
    for (int count=0; count<=(length-1); count++){
      if (input.codePointAt(count)<97 || input.codePointAt(count)>122){
        char toRemove = input.substring(count,count+1);
        input.replace(toRemove,"");
        System.out.println(input);
      }
    }
  }
}
