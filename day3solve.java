package day3;

import java.util.*;

public class day3solve {
    public final long solvepart1(List<String> input) {

        long count = 0;

        for (int i = 0; i <= input.size() - 1; i++) {

            long tensDigit = 0;
            long onesDigit = 0;

            for (int j = 1; j <= input.get(i).length(); j++) {

                Long value = Long.parseLong(input.get(i).substring(j - 1, j));

                if (value > tensDigit) {
                    if (input.get(i).length() != j) {
                        tensDigit = value;
                        onesDigit = 0;
                    } else {
                        if (value > onesDigit) {
                            onesDigit = value;
                        }

                    }

                } else if (value > onesDigit) {
                    onesDigit = value;

                }

            }

            count += (tensDigit * 10) + onesDigit;

        }

        return count;
    }

    public final long solvepart2(List<String> input) {

        long count = 0;
        long hundredGigaMultiple = 100000000000L;
        long tenGigaMultiple = 10000000000L;

        for (int i = 0; i <= input.size() - 1; i++) {

            long hundredGigasDigit = 0;
            long tenGigasDigit = 0;
            long gigasDigit = 0;
            long hundredMegasDigit = 0;
            long tenMegasDigit = 0;
            long megasDigit = 0;
            long hundredKilosDigit = 0;
            long tenKilosDigit = 0;
            long kilosDigit = 0;
            long hectosDigit = 0;
            long tensDigit = 0;
            long onesDigit = 0;

            for (int j = 1; j <= input.get(i).length(); j++) {

                Long value = Long.parseLong(input.get(i).substring(j - 1, j));

                if (value > hundredGigasDigit && input.get(i).length() - j >= 11) {

                    hundredGigasDigit = value;

                    tenGigasDigit = 0;
                    gigasDigit = 0;
                    hundredMegasDigit = 0;
                    tenMegasDigit = 0;
                    megasDigit = 0;
                    hundredKilosDigit = 0;
                    tenKilosDigit = 0;
                    kilosDigit = 0;
                    hectosDigit = 0;
                    tensDigit = 0;
                    onesDigit = 0;

                } else if (value > tenGigasDigit && input.get(i).length() - j >= 10) {

                    tenGigasDigit = value;

                    gigasDigit = 0;
                    hundredMegasDigit = 0;
                    tenMegasDigit = 0;
                    megasDigit = 0;
                    hundredKilosDigit = 0;
                    tenKilosDigit = 0;
                    kilosDigit = 0;
                    hectosDigit = 0;
                    tensDigit = 0;
                    onesDigit = 0;

                } else if (value > gigasDigit && input.get(i).length() - j >= 9) {

                    gigasDigit = value;

                    hundredMegasDigit = 0;
                    tenMegasDigit = 0;
                    megasDigit = 0;
                    hundredKilosDigit = 0;
                    tenKilosDigit = 0;
                    kilosDigit = 0;
                    hectosDigit = 0;
                    tensDigit = 0;
                    onesDigit = 0;

                } else if (value > hundredMegasDigit && input.get(i).length() - j >= 8) {

                    hundredMegasDigit = value;

                    tenMegasDigit = 0;
                    megasDigit = 0;
                    hundredKilosDigit = 0;
                    tenKilosDigit = 0;
                    kilosDigit = 0;
                    hectosDigit = 0;
                    tensDigit = 0;
                    onesDigit = 0;

                } else if (value > tenMegasDigit && input.get(i).length() - j >= 7) {

                    tenMegasDigit = value;

                    megasDigit = 0;
                    hundredKilosDigit = 0;
                    tenKilosDigit = 0;
                    kilosDigit = 0;
                    hectosDigit = 0;
                    tensDigit = 0;
                    onesDigit = 0;

                } else if (value > megasDigit && input.get(i).length() - j >= 6) {

                    megasDigit = value;

                    hundredKilosDigit = 0;
                    tenKilosDigit = 0;
                    kilosDigit = 0;
                    hectosDigit = 0;
                    tensDigit = 0;
                    onesDigit = 0;

                } else if (value > hundredKilosDigit && input.get(i).length() - j >= 5) {

                    hundredKilosDigit = value;

                    tenKilosDigit = 0;
                    kilosDigit = 0;
                    hectosDigit = 0;
                    tensDigit = 0;
                    onesDigit = 0;

                } else if (value > tenKilosDigit && input.get(i).length() - j >= 4) {

                    tenKilosDigit = value;

                    kilosDigit = 0;
                    hectosDigit = 0;
                    tensDigit = 0;
                    onesDigit = 0;

                } else if (value > kilosDigit && input.get(i).length() - j >= 3) {

                    kilosDigit = value;

                    hectosDigit = 0;
                    tensDigit = 0;
                    onesDigit = 0;

                } else if (value > hectosDigit && input.get(i).length() - j >= 2) {

                    hectosDigit = value;

                    tensDigit = 0;
                    onesDigit = 0;

                } else if (value > tensDigit && input.get(i).length() - j >= 1) {

                    tensDigit = value;

                    onesDigit = 0;

                } else if (value > onesDigit) {
                    onesDigit = value;

                }

            }

            count += (hundredGigasDigit * hundredGigaMultiple) +
                    (tenGigasDigit * tenGigaMultiple) +
                    (gigasDigit * 1000000000) +
                    (hundredMegasDigit * 100000000) +
                    (tenMegasDigit * 10000000) +
                    (megasDigit * 1000000) +
                    (hundredKilosDigit * 100000) +
                    (tenKilosDigit * 10000) +
                    (kilosDigit * 1000) +
                    (hectosDigit * 100) +
                    (tensDigit * 10) +
                    onesDigit;
            System.out.println(((hundredGigasDigit * hundredGigaMultiple) +
                    (tenGigasDigit * tenGigaMultiple) +
                    (gigasDigit * 1000000000) +
                    (hundredMegasDigit * 100000000) +
                    (tenMegasDigit * 10000000) +
                    (megasDigit * 1000000) +
                    (hundredKilosDigit * 100000) +
                    (tenKilosDigit * 10000) +
                    (kilosDigit * 1000) +
                    (hectosDigit * 100) +
                    (tensDigit * 10) +
                    onesDigit));

        }

        return count;
    }
}
