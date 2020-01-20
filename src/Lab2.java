import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Lab2 {
    public static void main(String[] args) {
        /*question1();
        question2();*/
        //question4();

        question3();
    }

    public static void question1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float radius = input.nextFloat();

        float area = radius * radius * (float) Math.PI;
        System.out.println("The area of the circle is: " + area);
    }

    public static void question2() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] input = new String[3];
        float a, b, c, avg;

        System.out.println("Please enter three numbers: ");
        try {
            input = in.readLine().split(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        a = Float.parseFloat(input[0]);
        b = Float.parseFloat(input[1]);
        c = Float.parseFloat(input[2]);

        avg = (a+b+c)/3;
        System.out.println("The average of the 3 numbers is: " + avg);
    }

    public static void  question3(){
        long currentTimeM = System.currentTimeMillis();
        long currentTimeS = currentTimeM/1000;
        long currentTimeMin = currentTimeS/60;
        long currentTimeH = currentTimeMin/60;

        long currentSeconds = currentTimeS%60;
        long currentMins = currentTimeMin%60;
        long currentHrs = currentTimeH%60;

        Timestamp timestamp = new Timestamp(currentTimeM);
        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SS");
        fmt.setTimeZone(TimeZone.getTimeZone("GMT"));

        System.out.println("The current time in GMT (milliseconds): " + currentTimeM);
        System.out.println("The current time in GMT (seconds): " + currentTimeS);
        System.out.println("The current time in GMT (minutes): " + currentMins);
        System.out.println("The current time in GMT (hours): " + currentTimeH);
        System.out.println("The current time in GMT (HH:mm:ss): " + fmt.format(timestamp));


        System.out.println("Seconds: " + currentSeconds);
        System.out.println("Minutes: " + currentMins);
        System.out.println("Hours: " + currentHrs);

        /*SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss zzz");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date date=new Date();
        String s=sdf.format(date);
        System.out.println("GMT: "+s);*/
    }

    public static void  question4(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //the year entered devided by 12. (eg.2020)
        //the remainder of the year entered divided by 12 (eg. 2020/12 = 168 R4)
        //hence, case 4 is rat
        switch (year % 12) {
            case 0: System.out.println("monkey"); break;
            case 1: System.out.println("rooster"); break;
            case 2: System.out.println("dog"); break;
            case 3: System.out.println("pig"); break;
            case 4: System.out.println("rat"); break;
            case 5: System.out.println("ox"); break;
            case 6: System.out.println("tiger"); break;
            case 7: System.out.println("rabbit"); break;
            case 8: System.out.println("dragon"); break;
            case 9: System.out.println("snake"); break;
            case 10: System.out.println("horse"); break;
            case 11: System.out.println("goat"); break;
        }
    }
}
