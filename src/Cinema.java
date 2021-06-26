import java.util.Scanner;
import java.text.DecimalFormat;
public class Cinema {
    public static void main(String[] args) {

        double noTicket, refe, total = 0,total1=0;
        double cost=0, sum, sum1, sum2, sum3=0;
        String ref, coupon , circle;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        noTicket = s.nextInt();
        if (noTicket < 5 || noTicket > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
            System.exit(0);
        }
        System.out.println("Do you want refreshment:");
        ref = s.next();
        System.out.println("Do you have coupon code:");
        coupon  = s.next();
        System.out.println("Enter the circle:");
        circle = s.next();
        if (circle.equals("k")) {
            total = noTicket * 75;
        } else if (circle.equals("q")) {
            total = noTicket * 150;
        } else {
            System.out.println("Invalid Input");
        }


        /* for 10% percent discount */
        if (noTicket > 20) {
            sum = ((0.1) * total);
            total = total - sum;
            total1=total;

        }
        if (ref.equals("y")) {
            refe = noTicket * 50;
            total = total + refe;
        }
        if (coupon.equals("y")) {
            sum2 = ((0.02) * total1);
            total = total - sum2;
            total1=total;

        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Ticket cost:" + df.format(total));
    }
}
