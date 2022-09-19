public class
Main {
    public static void main(String[] args) {

    double ccBalance = 5000;
    double interestRate = ccBalance * .17;
    double newBalance = ccBalance + interestRate;
    double monthlyBalance = newBalance + interestRate;
        System.out.println(" With the balance of 5,000 and an interest rate of 17% the balance after one month will be " + newBalance);

        System.out.print(" After 2 months the new balance will be " + monthlyBalance);



    }
}