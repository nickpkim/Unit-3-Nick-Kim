import java.util.Scanner;
import java.text.DecimalFormat;
public class WinPercentage{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat("0.0");
    System.out.println("# of games played");
    int totalGames = scan.nextInt();
    System.out.println("# of games won");
    int totalWins = scan.nextInt();
    if (totalGames<1)
      System.out.println("# of games played must be greater than zero");
    else if (totalWins<0)
      System.out.println("# of games won must be greater than or equal to zero");
    else if (totalGames<totalWins)
      System.out.println("# of games won must be less than # of games played");
    else {
      double winPercentage = totalWins*100.0/totalGames;
      System.out.println(fmt.format(winPercentage)+"%");
    }
  }
}
