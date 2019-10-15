import java.util.Scanner;
public class PalindromeTester{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    input = input.toLowerCase();
    int length = input.length();
    System.out.println(input+" "+length);
    /*for (int count=0; count<=(length-1); count++){
      if (input.codePointAt(count)<97 || input.codePointAt(count)>122){
        char toRemove = input.substring(count,count+1);
        input.replace(toRemove,"");
      }
    }*/
    System.out.println(input);
    if (input.length()%2 != 0){
      char mid = input.charAt((int)(input.length()/2));
      input = input.replace(Character.toString(mid),"");
    }
    input = input.substring(0,input.length()/2);
    System.out.print(input);
    
  }
}
