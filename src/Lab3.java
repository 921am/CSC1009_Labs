import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lab3 {
    float interest, years;
    double loan;
    LocalDateTime loanDate;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter interest (eg. 2.5): ");
        float input_interest = input.nextFloat();
        Lab3 interest = new Lab3();
        interest.setInterest(input_interest);

        System.out.println("Enter number of years (eg. 2.5): ");
        float input_years = input.nextFloat();
        Lab3 years = new Lab3();
        years.setYears(input_years);

        System.out.println("Enter loan amount (eg. 2.5): ");
        double input_loan = input.nextDouble();
        Lab3 loan = new Lab3();
        loan.setLoan(input_loan);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime loan_date = LocalDateTime.now();
        Lab3 date = new Lab3();
        date.setLoanDate(loan_date);

        //get values
        float newInterest = interest.getInterest();
        float newYears = years.getYears();
        double newLoan = loan.getLoan();
        LocalDateTime newDate = date.getDate();

        System.out.println("The loan was created on: " + newDate);
        //monthly
        Lab3 month = new Lab3();
        double monthlyPay = month.getMonthlyPayment(newLoan, newInterest, newYears);
        System.out.println("The monthly payment: " + monthlyPay);

        //total
        Lab3 total = new Lab3();
        double totalPay = total.getTotalPayment(monthlyPay, newYears);
        System.out.println("The total payment is: " + totalPay);
    }

    public float getInterest (){
        return interest;
    }
    public void setInterest(float interest){
        this.interest = interest;
    }

    public float getYears (){
        return years;
    }
    public void setYears(float years){
        this.years = years;
    }

    public double getLoan(){
        return loan;
    }
    public void setLoan(double loan){
        this.loan = loan;
    }

    public LocalDateTime getDate(){
        return loanDate;
    }
    public void setLoanDate(LocalDateTime loanDate){
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment(double loan, float interest, float years){
        double monthlyPayment = (loan*interest)/(1-(1/(1+Math.pow(interest,(years*12)))));
        return  monthlyPayment;
    }

    public double getTotalPayment (double monthly, float years){
        double totalPayament = monthly*years*12;
        return totalPayament;
    }
}
