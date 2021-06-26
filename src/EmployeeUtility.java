import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.stream.Stream;

public class EmployeeUtility {

    public Employee[] getEmployeeDetails(String[] details) {

        Employee[] ob = new Employee[details.length];
        for(int i = 0;i<details.length;i++){
            String[] x = details[i].split(";");
            Employee o = new Employee();
            o.setEmpId(x[0]);
            o.setEmpName(x[1]);
            o.setSalary(Double.parseDouble(x[2]));
            ob[i] = o;
        }

        return ob;

    }

    public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

        return Arrays.stream(empDetails);

    }

    public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

        ArrayList<String> name = new ArrayList<>();
        empStream.forEach(a->{
            if(a.getSalary()>= minSalary)
            {
                DecimalFormat df = new DecimalFormat("#.0");
                String sal = df.format(a.getSalary());
                name.add(a.getEmpId()+" "+a.getEmpName()+" "+sal);
            }
        });

        String[] s = new String[name.size()];
        for(int i = 0;i<s.length;i++){
            s[i] = name.get(i);
        }
        Arrays.sort(s);
        return s;
    }

}
