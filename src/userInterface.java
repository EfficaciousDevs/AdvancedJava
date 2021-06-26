import java.util.Scanner;
public class userInterface {

    public static CommissionInfo generateCommissionObtained(){
        return (x)->{
            if(x.getClassType().equalsIgnoreCase("SL") || x.getClassType().equalsIgnoreCase("2S"))
                return 60;
            else {
                if (x.getClassType().equalsIgnoreCase("1A") || x.getClassType().equalsIgnoreCase("2A")
                        || x.getClassType().equalsIgnoreCase("3A"))
                    return 100;
            }
            return 0;
        };
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of passengers");
        int n = sc.nextInt();
        Ticket[] tarr = new Ticket[n];
        for(int i = 0;i<n;i++){
            System.out.println("Details of Passenger " + (i+1) + ":");
            System.out.println("Enter the pnr no:");
            long pnr = sc.nextLong();
            System.out.println("Enter passenger name:");
            String name = sc.next();
            System.out.println("Enter the seat no:");
            int seat = sc.nextInt();
            System.out.println("Enter class type:");
            String clas = sc.next();
            System.out.println("Enter ticket fare:");
            double fare = sc.nextDouble();

            Ticket t = new Ticket(pnr,name,seat,clas,fare);
            tarr[i] = t;
        }

        double comm = 0;
        for (Ticket ticket : tarr) {
            CommissionInfo cminfo = generateCommissionObtained();

            comm += cminfo.calculateCommissionAmount(ticket);
        }
        System.out.println("Commission Obtained");
        System.out.printf("Commission obtained per each person: Rs.%.2f",comm);

    }

}