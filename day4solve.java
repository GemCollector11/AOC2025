package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day4solve {
    private List<String> input = new ArrayList<String>();

    public long totalCount = 0;

    public final void solvepart2(List<String> input) {

        long count = 0;
        long numberOfrolls = 0;

        this.input = new ArrayList<String>();
        String[] inputRaw = new String[input.size()];

        for (int i = 0; i <= input.size() - 1; i++) {

            if (i == input.size()) {
                break;
            }

            for (int f = i; f <= inputRaw.length - 1; f++) {
                inputRaw[f] = "-";
            }

            String[] row1 = new String[input.size()];
            String[] row2 = new String[input.size()];
            String[] row3 = new String[input.size()];

            for (int j = 1; j <= input.get(i).length(); j++) {

                row2[j - 1] = input.get(i).substring(j - 1, j);

                if (i != 0) {
                    row1[j - 1] = input.get(i - 1).substring(j - 1, j);
                }
                if (i != input.get(i).length() - 1) {
                    row3[j - 1] = input.get(i + 1).substring(j - 1, j);
                }

            }

            for (int s = 0; s <= row2.length - 1; s++) {

                if (!row2[s].equals(".")) {

                    if (s == 0 && i == 0) {
                        for (int k = 0; k <= 1; k++) {
                            if (row3[s + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (s == row2.length - 1 && i == input.get(i).length() - 1) {

                        for (int k = 0; k <= 1; k++) {
                            if (row1[s - k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (s == 0 && i == input.get(i).length() - 1) {

                        for (int k = 0; k <= 1; k++) {
                            if (row1[s + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (s == row2.length - 1 && i == 0) {

                        for (int k = 0; k <= 1; k++) {
                            if (row3[s - k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (s == 0) {

                        for (int k = 0; k <= 1; k++) {
                            if (row3[s + k].equals("@")) {
                                numberOfrolls++;
                            }
                            if (row1[s + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (s == row2.length - 1) {

                        for (int k = 0; k <= 1; k++) {
                            if (row3[s - k].equals("@")) {
                                numberOfrolls++;
                            }
                            if (row1[s - k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (i == 0) {

                        for (int k = 0; k <= 2; k++) {
                            if (row3[(s - 1) + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (i == input.get(i).length() - 1) {

                        for (int k = 0; k <= 2; k++) {
                            if (row1[(s - 1) + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else {
                        for (int k = 0; k <= 2; k++) {
                            if (row1[(s - 1) + k].equals("@")) {
                                numberOfrolls++;
                            }
                            if (row3[(s - 1) + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }
                    }

                    if (numberOfrolls < 4) {
                        row2[s] = ".";
                        count++;

                    }
                    numberOfrolls = 0;

                }
                inputRaw[i] = "-";
                for (int f = 0; f <= row2.length - 1; f++) {
                    inputRaw[i] = String.join("", inputRaw[i], row2[f]);
                }
                inputRaw[i] = inputRaw[i].replace("-", "");

            }

        }
        for (int f = 0; f <= input.size() - 1; f++) {
            this.input.add(inputRaw[f]);
        }
        if (count != 0) {
            solvepart2(this.input);
            totalCount += count;
        }

    }

    public final long solvepart1(List<String> input) {
        long count = 0;
        long numberOfrolls = 0;

        for (int i = 0; i <= input.size() - 1; i++) {

            if (i == input.size()) {
                break;
            }

            String[] row1 = new String[input.size()];
            String[] row2 = new String[input.size()];
            String[] row3 = new String[input.size()];

            for (int j = 1; j <= input.get(i).length(); j++) {

                row2[j - 1] = input.get(i).substring(j - 1, j);

                if (i != 0) {
                    row1[j - 1] = input.get(i - 1).substring(j - 1, j);
                }
                if (i != input.get(i).length() - 1) {
                    row3[j - 1] = input.get(i + 1).substring(j - 1, j);
                }

            }

            for (int s = 0; s <= row2.length - 1; s++) {

                if (!row2[s].equals(".")) {

                    if (s == 0 && i == 0) {
                        for (int k = 0; k <= 1; k++) {
                            if (row3[s + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (s == row2.length - 1 && i == input.get(i).length() - 1) {

                        for (int k = 0; k <= 1; k++) {
                            if (row1[s - k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (s == 0 && i == input.get(i).length() - 1) {

                        for (int k = 0; k <= 1; k++) {
                            if (row1[s + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (s == row2.length - 1 && i == 0) {

                        for (int k = 0; k <= 1; k++) {
                            if (row3[s - k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (s == 0) {

                        for (int k = 0; k <= 1; k++) {
                            if (row3[s + k].equals("@")) {
                                numberOfrolls++;
                            }
                            if (row1[s + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (s == row2.length - 1) {

                        for (int k = 0; k <= 1; k++) {
                            if (row3[s - k].equals("@")) {
                                numberOfrolls++;
                            }
                            if (row1[s - k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (i == 0) {

                        for (int k = 0; k <= 2; k++) {
                            if (row3[(s - 1) + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else if (i == input.get(i).length() - 1) {

                        for (int k = 0; k <= 2; k++) {
                            if (row1[(s - 1) + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }

                    } else {
                        for (int k = 0; k <= 2; k++) {
                            if (row1[(s - 1) + k].equals("@")) {
                                numberOfrolls++;
                            }
                            if (row3[(s - 1) + k].equals("@")) {
                                numberOfrolls++;
                            }
                        }
                        if (row2[s - 1].equals("@")) {
                            numberOfrolls++;
                        }
                        if (row2[s + 1].equals("@")) {
                            numberOfrolls++;
                        }
                    }

                    if (numberOfrolls < 4) {
                        count++;

                    }
                    numberOfrolls = 0;

                }

            }

        }

        return count;
    }
}
