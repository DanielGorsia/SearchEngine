public class Main {

    public static void main(String[] args) {
        Exam exam = new Exam();

        /*
        checks for question number 1
         */
        int check1 = exam.maximumNumberOfLetterA("a");
        System.out.println("check1 = " + check1);

        int check2 = exam.maximumNumberOfLetterA("aa");
        System.out.println("check2 = " + check2);

        int check3 = exam.maximumNumberOfLetterA("aaa");
        System.out.println("check3 = " + check3);

        int check4 = exam.maximumNumberOfLetterA("dog");
        System.out.println("check4 = " + check4);

        int check5 = exam.maximumNumberOfLetterA("bat");
        System.out.println("check5 = " + check5);

        int check6 = exam.maximumNumberOfLetterA("abcad");
        System.out.println("check6 = " + check6);

        int check7 = exam.maximumNumberOfLetterA("bacad");
        System.out.println("check7 = " + check7);

        int check8 = exam.maximumNumberOfLetterA("baaaa");
        System.out.println("check8 = " + check8);

        int check9 = exam.maximumNumberOfLetterA("aabaa");
        System.out.println("check9 = " + check9);

        int check10 = exam.maximumNumberOfLetterA("abagaha");
        System.out.println("check10 = " + check10);
         /*
        checks for question number 2
         */
         String day1 = exam.getKDayAfter("Sat", 23);
         System.out.println("SAT + 23 = " + day1);

        String day2 = exam.getKDayAfter("Mon", 49);
        System.out.println("MON + 49 = " + day2);

        String day3 = exam.getKDayAfter("Sun", 60);
        System.out.println("SUN + 60 = " + day3);

        String day4 = exam.getKDayAfter("Wed", 2);
        System.out.println("Wed + 2 = " + day4);

        /*
        checks for question number 3
         */
        int N = 268;
        int ans1 = exam.getMaximumValue(N);
        System.out.println("N = " + N + ": " + ans1);

        N = -999;
        int ans2 = exam.getMaximumValue(N);
        System.out.println("N = " + N + ": " + ans2);

        N = 670;
        int ans3 = exam.getMaximumValue(N);
        System.out.println("N = " + N + ": " + ans3);

        N = 0;
        int ans4 = exam.getMaximumValue(N);
        System.out.println("N = " + N + ": " + ans4);

        N = 9379;
        int ans5 = exam.getMaximumValue(N);
        System.out.println("N = " + N + ": " + ans5);

        N = -24890;
        int ans6 = exam.getMaximumValue(N);
        System.out.println("N = " + N + ": " + ans6);

        N = 999;
        int ans7 = exam.getMaximumValue(N);
        System.out.println("N = " + N + ": " + ans7);

        N = -8000;
        int ans8 = exam.getMaximumValue(N);
        System.out.println("N = " + N + ": " + ans8);

        N = 8000;
        int ans9 = exam.getMaximumValue(N);
        System.out.println("N = " + N + ": " + ans9);

        N = 6429;
        int ans10 = exam.getMaximumValue(N);
        System.out.println("N = " + N + ": " + ans10);


    }
}
