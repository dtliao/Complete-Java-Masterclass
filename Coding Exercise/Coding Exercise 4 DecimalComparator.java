public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int firstNumber = (int)(num1*1000);
        int secondNumber = (int)(num2*1000);
        return (firstNumber==secondNumber);
    }   
}