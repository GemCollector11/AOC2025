import java.util.List;
import helper.ResourceHelper;
import day1.day1Solve;

public class App {

    public static void main(String[] args) {
        List<String> lines = ResourceHelper.loadLinesFromFile("day1input.txt");

        day1Solve day1 = new day1Solve();

        int result = day1.solvepart2(lines);

        System.out.println(result);

    }
}