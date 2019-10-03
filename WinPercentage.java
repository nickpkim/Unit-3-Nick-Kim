import java.util.Scanner;
import java.text.DecimalFormat;
public class WinPercentage{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    DecimalFormat fmt = new DecimalFormat(".00");
    System.out.println("# of games played");
    int totalGames = scan.nextInt();
    System.out.println("# of games won");
    int totalWins = scan.nextInt();
    double winPercentage = totalWins*100.0/totalGames;
    System.out.println(fmt.format(winPercentage)+"%");
  }
}
