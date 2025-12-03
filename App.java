import java.util.List;
import helper.ResourceHelper;
import day1.day1Solve;
import day2.day2solve;

public class App {

    public static void main(String[] args) {
        day2solver();
    }

    public static void day2solver() {
        List<String> lines = ResourceHelper.loadLinesFromFile("day2/day2sample.txt");

        day2solve day2 = new day2solve();

        long result = day2.solvepart2(lines);

        System.out.println("4174379265, " + result);
    }

    public static void day1solver() {
        List<String> lines = ResourceHelper.loadLinesFromFile("day1/day1input.txt");

        day1Solve day1 = new day1Solve();

        int result = day1.solvepart2(lines);

        System.out.println(result);
    }
}