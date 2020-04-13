import java.util.Arrays;

public class Exam {


//    public int solution(String S) {
//
//    }

    public int maximumNumberOfLetterA(String S) {
        if (S.contains("aaa")) {
            return -1;
        }
        String wordWithoutA = S.replaceAll("a", "");
        int countLetterA = S.length() - wordWithoutA.length();
        int maxNumberOfLetterA = (wordWithoutA.length() + 1) * 2;
        return maxNumberOfLetterA - countLetterA;
    }

//    public String solution(String S, int K) {
//
//    }

    public String getKDayAfter(String S, int K) {
        String[] daysArr = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int indexOfDay = 0;
        for (int i = 0; i < daysArr.length; i++){
            if (S.equals(daysArr[i])){
                indexOfDay = i;
                break;
            }
        }
        int numOfDays = (indexOfDay + (K % 7)) % 7;
        return daysArr[numOfDays];
    }


//    public int solution(int N) {
//
//    }

    public int getMaximumValue(int N) {
        boolean negative = false;
        String numberN = String.valueOf(N);
        int five = 5;
        if (N < 0) {
            negative = true;
            numberN = numberN.substring(1);
        }
        for (int i = 0; i < numberN.length(); i++) {
            char c = numberN.charAt(i);
            if (negative) {
                if (five <= Character.getNumericValue(c)) {
                    return Integer.parseInt("" + numberN.substring(0, i) + five + numberN.substring(i)) * -1;
                }
            } else {
                if (five >= Character.getNumericValue(c)) {
                    return Integer.parseInt("" + numberN.substring(0, i) + five + numberN.substring(i));
                }
            }
        }
        int ans = Integer.parseInt("" + numberN + five);
        return negative ? ans*(-1) : ans;
    }


//    public int solution(int[] A) {
//         Arrays.sort(A);
//         int ans = 1;
//         for (int i=0; i<A.length; i++){
//             if(A[i] > 0){
//                 if(ans < A[i]){
//                     break;
//                 }
//                  if((i+1 < A.length) && (A[i]+1 < A[i+1])){
//                      ans = A[i]+1;
//                      break;
//                  }
//                 ans = ans+1;
//             }
//         }
//         return ans;
//    }
}




/*
    public int getMaximumValue (int N){
        boolean negative;
        int lengthOfN = String.valueOf(N).length();
        if( N < 0 ){
            negative = true;
            lengthOfN = String.valueOf(N).length() - 1;
        }
        else{
            negative = false;
            lengthOfN = String.valueOf(N).length() ;
        }
        int divider =  (int)Math.pow(10, lengthOfN-1);
        int five = 5;
        int currentNumber = N ;
        int digit = 0;

        for(int i=0; i<lengthOfN; i++){
            digit = currentNumber / divider ;
            if(!negative) {
                if (five >= digit) {
                    return (N - (N % (divider * 10))) * 10 + 5 * divider + (N % (divider * 10)) ;
                }
            }
            else{
                if (five <= (N / divider)) {
                    return N + five * divider * 10;
                }
            }
            currentNumber = currentNumber - divider;
            divider = divider/10;
        }
        return negative ? N*10 - five : N*10 + five;

    }

 */


