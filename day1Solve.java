package day1;

import java.util.*;

public class day1Solve {

    public final int solvepart1(List<String> input) {
        double angle = 50;
        int total = 0;

        for (int i = 0; i < input.size(); i++) {

            angle += Double.parseDouble(input.get(i).replace("L", "-").replace("R", ""));
            // takes the value, replaces the L and R, then turns it into a double
            angle = Math.IEEEremainder(angle, 100);

            if (angle == 0) {
                total++;
            }

        }
        return total;

    }

    public final int solvepart2(List<String> input) {
        double angle = 50;
        int total = 0;
        double value = 0;
        int k = 0;

        for (int i = 0; i < input.size(); i++) {

            value = Double.parseDouble(input.get(i).replace("L", "-").replace("R", ""));
            // takes the value, replaces the L and R, then turns it into a double
            k = 0;
            if (value < 0) {
                while (k > value) {
                    angle--;
                    angle = Math.IEEEremainder(angle, 100);
                    if (angle == 0) {
                        total++;
                    }
                    k--;
                }

            } else {

                while (k < value) {
                    angle++;
                    angle = Math.IEEEremainder(angle, 100);
                    if (angle == 0) {
                        total++;
                    }
                    k++;
                }
            }
        }
        return total;

    }

}
