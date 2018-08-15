public class LargestPrime {
    public static int getLargestPrime(int number){
        if (number < -1) return -1;
        for(int i = number; number > 1; i--){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }   
            if(isPrime && number % i == 0){
                return i;
            }
        }
        return -1;
    }
}