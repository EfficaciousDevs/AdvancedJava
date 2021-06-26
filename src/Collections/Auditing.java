package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Auditing {
    private static HashMap<String,Double> hmap = new HashMap<>();

    public static HashMap<String, Double> getHmap() {
        return hmap;
    }

    public static void setHmap(HashMap<String, Double> hmap) {
        Auditing.hmap = hmap;
    }

    public void addEmployeeDetails(String employeeName, double salary){

        hmap.put(employeeName,salary);
    }
    public static EmployeeAuditing findEmployee(){
        EmployeeAuditing ea = (sal)->{
            ArrayList<String> empName = new ArrayList<>();
            for(HashMap.Entry<String,Double> map : hmap.entrySet()){
                if(map.getValue() <= sal)
                    empName.add(map.getKey());
            }
            return empName;
        };
        return ea;
    }

    public static void main(String[] args) {
        System.out.println("1.Add Employee Details");
        System.out.println("2.Find Employee Details");
        System.out.println("3.Exit");

        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the Employee name");
                String empName = sc.next();
                System.out.println("Enter the Employee Salary");

                double salary = sc.nextDouble();

                Auditing audit = new Auditing();
                audit.addEmployeeDetails(empName,salary);
                break;

            case 2:
                System.out.println("Enter the salary to be searched");
                double CheckSalary = sc.nextDouble();
                EmployeeAuditing eA = findEmployee();
                ArrayList<String> empDetails = eA.fetchEmployeeDetails(CheckSalary);
                if(!empDetails.isEmpty())
                {
                    for(String str: empDetails)
                        System.out.println(str);
                }
                else
                    System.out.println("No Employee Found");

                break;

            default:
                System.out.println("Let's complete the session");
                break;
        }
    }
}
