public class Customer {
    private int custid;
    private String custName;
    private String ifscCode;
    private String Location;
    private long acctNumber;

    public Long getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(Long acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getIfscCode(){
        return ifscCode;
    }

    public void setIfscCode(String email){
        this.ifscCode = email;
    }

    public Customer(int id,String name,long acctNumber,String ifscCode,String location){
        this.custid = id;
        this.custName = name;
        this.acctNumber = acctNumber;
        this.Location = location;
        this.ifscCode = ifscCode;
    }
}
