package ExceptionHandling;

import java.util.Scanner;

class Candidate{
    private String NAme;
    private String Gender;
    private double expectedSalary;

    public String getNAme() {
        return NAme;
    }

    public void setNAme(String NAme) {
        this.NAme = NAme;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(double expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

}
class InvalidSalaryException extends Exception{
//    @Override
//    public String toString() {
//        return super.toString();
//    }
    @Override
    public String getMessage(){
        return "Registration Failed. Salary cannot be less than 10000.";
    }
}
public class CustomExceptions {
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String gender =  sc.nextLine();
        double salary = sc.nextDouble();

        if(salary < 10000)
        {
            throw new InvalidSalaryException();
        }

        Candidate cd = new Candidate();
        cd.setNAme(name);
        cd.setGender(gender);
        cd.setExpectedSalary(salary);
        return cd;

    }

    public static void main(String[] args) {
        try{
            getCandidateDetails();
            System.out.println("Registration Successful");
        }catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}
