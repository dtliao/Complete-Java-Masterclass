public class LastDigitChecker {
    public static boolean hasSameLastDigit(int x, int y, int z){
        if((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000)){
            return false;
        }
        int num1 = x % 10;
        int num2 = y % 10;
        int num3 = z % 10;
        return (num1 == num2) || (num2 == num3) || (num1 == num3);
    }
}   