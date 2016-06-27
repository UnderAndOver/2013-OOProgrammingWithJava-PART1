import nhlstats.NHLStatistics;

public class Main {
    public static void main(String[] args) {
        NHLStatistics.sortByGoals();
        System.out.println("Top 10 by points: ");
        NHLStatistics.top(10);
        NHLStatistics.sortByPenalties();
        System.out.println("Top 25 by penalties: ");
        NHLStatistics.top(25);
        System.out.println("Statistics for Sidney Crosby: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("Statistics for Philadelphia Flyers: ");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("Statistics of the Anaheim Ducks: ");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
        
    }
}
