import java.time.LocalDateTime;


public class Lab3_Loan {
    float interest, years;
    double loan;
    LocalDateTime loanDate;

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

    public double getTotalPayment (double monthly, float years) {
        double totalPayament = monthly * years * 12;
        return totalPayament;
    }
}
