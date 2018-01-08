import java.util.*;

public class SuperArrayDriver {

    public static void main(String[] args) {
        for (int x = 0; x < 10; x++) {
            runTest01(x);
        }
    }

    public static void runTest01(int testID) {
        if (testID < 0) {
            System.out.println("Error in driver usage!");
            System.exit(0);
        }


        SuperArray s1 = new SuperArray();
        ArrayList<String> s2 = new ArrayList<>();

        try {
            if (testID == 0) {
            }

            if (testID == 1) {
                s1.add("0");
                s2.add("0");
                s1.add("1");
                s2.add("1");
            }

            if (testID == 2) {

                s1.add("0");
                s2.add("0");
                s1.add("1");
                s2.add("1");
                s1.add(1, "5");
                s2.add(1, "5");
                s1.add(0, "6");
                s2.add(0, "6");
                s1.add(s1.size() - 1, "4");
                s2.add(s2.size() - 1, "4");
            }

            if (testID == 3) {
                s1.add("0");
                s2.add("0");
                s1.add("1");
                s2.add("1");
                s1.add(1, "5");
                s2.add(1, "5");
                s1.add(0, "6");
                s2.add(0, "6");
                s1.add(s1.size(), "4");
                s2.add(s2.size(), "4");
            }

            if (testID == 4) {
                s1.add(0, "0");
                s2.add(0, "0");
            }

            if (testID == 5) {
                s1.add("1");
                s2.add("1");
                for (int i = 0; i < 10; i++) {
                    String v = "" + (int) (Math.random() * 1000);
                    int in = (int) (Math.random() * s2.size());
                    s1.add(in, v);
                    s2.add(in, v);
                }
            }

            if (testID == 6) {
                try {
                    s1.get(0);
                } catch (IndexOutOfBoundsException e) {

                }
            }

            if (testID == 7) {
                try {
                    s1.set(0, "");
                } catch (IndexOutOfBoundsException e) {

                }
            }

            if (testID == 8) {
                try {
                    s1.add(1, "");
                } catch (IndexOutOfBoundsException e) {

                }
            }
            if (testID == 9) {
                s1.add("1");
                s2.add("1");

                for (int i = 0; i < 1000; i++) {
                    String v = "" + (int) (Math.random() * 1000);
                    int in = (int) (Math.random() * s2.size());
                    s1.add(in, v);
                    s2.add(in, v);
                }
            }


        } catch (Exception f) {
            s2.add("0");
            //f.printStackTrace();
        }

        if (equals(s1, s2)) {
            System.out.println("Test " + testID + ",PASS");
        } else {
            System.out.println("Test " + testID + ",FAIL");
        }


    }

    //oops! forgot this
    public static boolean equals(SuperArray s, ArrayList<String> a) {
        if (s.size() == a.size()) {
            for (int i = 0; i < s.size(); i++) {
                if (!s.get(i).equals(a.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


}



