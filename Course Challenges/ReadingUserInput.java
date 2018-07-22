import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    int sum = 0;
	    int count = 0;

	    while(count < 10) {
            count += 1;
            System.out.println("Enter number #" + count + ":");

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
            }else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
