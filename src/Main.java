
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map <String,Double> employeeMap = new HashMap<>();

    public Map<String, Double> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Double> employeeMap) {
        Main.employeeMap = employeeMap;
    }

    public void addEmployeeDetails(String employeeName, double salary)
    {
        employeeMap.put(employeeName,salary);
    }



    public static EmployeeAudit findEmployee()
    {
        EmployeeAudit emp = x->{ArrayList<String> name=new ArrayList<>();
            for(Map.Entry<String, Double> entry:employeeMap.entrySet()){
                if(entry.getValue() <= x){
                    name.add(entry.getKey());
                }
            }
            return name;
        };
        return emp;
    }

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);

        int display = 0;
        while(display == 0){
            System.out.println("1. Add Employee details");
            System.out.println("2. Find Employee details");
            System.out.println("3. Exit");
            System.out.println("Enter the choice");

            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the Employee name");
                    String name = sc.next();
                    System.out.println("Enter the Employee salary");
                    double sal = sc.nextDouble();
                    Main obj = new Main();
                    obj.addEmployeeDetails(name,sal);
                    break;
                case 2 :
                    System.out.println("Enter the salary to be searched");
                    double salr = sc.nextDouble();
                    EmployeeAudit emp = findEmployee();
                    ArrayList<String> s =  emp.fetchEmployeeDetails(salr);
                    if(s.isEmpty())
                        System.out.println("No Employee found");
                    else
                    {
                        System.out.println("Employee list");
                        for (String value : s) {
                            System.out.println(value);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Let's complete the session");
                    display = 1;
                    break;

            }

        }
    }

}
