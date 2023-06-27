// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //A program that starts with a credit card balance
        // of $5000 and then calculates the interest at a rate of 17%.
        // Assume the user does not make any payments.
        // Display the interest due after one month and again after two months.

        int userBalance = 5000;
        double interestOne = (userBalance * 0.17 * 1) / (100 * 12);
        double interestTwo = (userBalance * 0.17 * 2) / (100 * 12);

        System.out.println("Your interest after one month is: "+interestOne);
        System.out.println("Your interest after two months is: "+interestTwo);
    }
}
