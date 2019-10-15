import java.util.Scanner;
public class Multiples{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    boolean multipleValid = false;
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
    boolean limitValid = false;
    String limitInput = "";
    while (limitValid == false){
      System.out.println("with an upper limit of:");
      limitInput = scan.nextLine();
      for (int j=0; j<limitInput.length(); j++){
        if (limitInput.codePointAt(j)<48 || limitInput.codePointAt(j)>57 || Integer.parseInt(limitInput)<multiple){
          System.out.println("error: must be a non-decimal positive integer greater than the multiple");
          break;
        } else if(j == limitInput.length()-1){
          limitValid = true;
        }
      }
    }
    int limit = Integer.parseInt(limitInput);
    for (int i = 0; i < limit/multiple; i++){
      if (i%5 == 0){
        System.out.println();
      } else{
        System.out.print(multiple*i+"    ");
      }
    }
  }
}
