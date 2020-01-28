import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Lab3_interest {

    public void getPredictedPay(double loan, float years){
        double [] monthly = new double[12];
        double [] total = new double[12];
        float interest = 2.5f;
        float [] allInterest = new float[12];

        Lab3_Loan takenLoan = new Lab3_Loan();

        System.out.println(String.format("%15s %15s %15s\n", "Interest", "Monthly($)", "Yearly($)"));
        for (int i = 0; i < 15; i++){
            monthly[i] = takenLoan.getMonthlyPayment(loan, interest, years);
            total[i]= takenLoan.getTotalPayment(monthly[i], years);
            allInterest[i] = interest;
            System.out.println(String.format("%14.2f %14.2f %15.2f\n", allInterest[i], monthly[i], total[i]));

            interest = interest + 0.1f;
        }
    }
}
