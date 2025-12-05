package day2;

import java.util.*;

public class day2solve {

    public final long solvepart1(List<String> input) {
        long count = 0;
        long minval = 0;
        long maxval = 0;

        for (int i = 0; i < input.size(); i++) {

            minval = Long.parseLong(input.get(i).replace(",", "").split("-")[0]);
            maxval = Long.parseLong(input.get(i).replace(",", "").split("-")[1]);

            for (Long k = Math.abs(minval); k <= Math.abs(maxval); k++) {

                String value = k.toString();
                int lengthOfSubval = (value.length()) / 2;
                String subval1 = value.substring(0, lengthOfSubval);
                String subval2 = value.substring(lengthOfSubval, value.length());

                if (subval1.startsWith("0")) {

                    count += Long.parseLong(value);
                } else if (subval1.equals(subval2)) {

                    count += Long.parseLong(value);
                }

            }

        }

        return count;
    }

    public final long solvepart2(List<String> input) {
        long count = 0;
        long minval = 0;
        long maxval = 0;

        for (int i = 0; i < input.size(); i++) {

            minval = Long.parseLong(input.get(i).replace(",", "").split("-")[0]);
            maxval = Long.parseLong(input.get(i).replace(",", "").split("-")[1]);

            for (Long k = Math.abs(minval); k <= Math.abs(maxval); k++) {
                String value = k.toString();
                boolean useDiv1 = true;
                boolean useDiv2 = true;
                boolean useDiv3 = true;
                boolean useDiv4 = true;
                boolean useDiv5 = true;
                boolean isInvalid = false;

                for (int j = 0; j <= value.length(); j++) {
                    int div = 0;
                    int div1 = 1;
                    int div2 = 2;
                    int div3 = 3;
                    int div4 = 4;
                    int div5 = 5;

                    if (useDiv1 && value.length() % div1 == 0) {
                        div = div1;
                    } else if (useDiv2 && value.length() % div2 == 0) {
                        div = div2;
                    } else if (useDiv3 && value.length() % div3 == 0) {
                        div = div3;
                    } else if (useDiv4 && value.length() % div4 == 0) {
                        div = div4;
                    } else if (useDiv5 && value.length() % div5 == 0) {
                        div = div5;
                    } else {
                        break;
                    }
                    String[] numSet = new String[value.length() / div];
                    int lengthOfSubval = (div);

                    for (int l = 0; l < numSet.length; l++) {
                        int len = l * lengthOfSubval;
                        numSet[l] = value.substring(len, len + lengthOfSubval);

                    }

                    for (int m = 1; m < numSet.length; m++) {
                        if (value.length() > 1) {
                            if (numSet[m - 1].equals(numSet[m])) {
                                isInvalid = true;
                            } else {
                                if (useDiv1) {
                                    useDiv1 = false;
                                } else if (useDiv2) {
                                    useDiv2 = false;
                                } else if (useDiv3) {
                                    useDiv3 = false;
                                } else if (useDiv4) {
                                    useDiv4 = false;
                                } else if (useDiv5) {
                                    useDiv5 = false;
                                }
                                isInvalid = false;
                                break;
                            }
                        }
                    }
                    if (isInvalid) {
                        System.out.println(k);
                        count += k;
                        break;
                    }
                }
            }

        }
        return count;
    }
}
