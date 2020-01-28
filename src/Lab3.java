import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter interest (eg. 2.5): ");
        float input_interest = input.nextFloat();
        Lab3_Loan takenLoan = new Lab3_Loan();
        takenLoan.setInterest(input_interest);

        System.out.println("Enter number of years (eg. 2.5): ");
        float input_years = input.nextFloat();
        takenLoan.setYears(input_years);

        System.out.println("Enter loan amount (eg. 2.5): ");
        double input_loan = input.nextDouble();
        takenLoan.setLoan(input_loan);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime loan_date = LocalDateTime.now();
        takenLoan.setLoanDate(loan_date);

        //get values
        float newInterest = takenLoan.getInterest();
        float newYears = takenLoan.getYears();
        double newLoan = takenLoan.getLoan();
        LocalDateTime newDate = takenLoan.getDate();

        System.out.println("The loan was created on: " + newDate);

        //monthly
        double monthlyPay = takenLoan.getMonthlyPayment(newLoan, newInterest, newYears);
        System.out.println("The monthly payment: " + monthlyPay);

        //total
        double totalPay = takenLoan.getTotalPayment(monthlyPay, newYears);
        System.out.println("The total payment is: " + totalPay);

        Lab3_interest predict = new Lab3_interest();
        predict.getPredictedPay(newLoan, newYears);
    }
}
