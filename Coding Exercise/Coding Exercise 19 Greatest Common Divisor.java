public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10 ) return -1;
        int smaller = (first < second) ? first : second;
        for(int i=smaller; i>=1; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return 1;
    }
}