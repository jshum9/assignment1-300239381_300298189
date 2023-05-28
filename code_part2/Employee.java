public class Employee {
    /**
     * Creating variables displayed in memory diagram. 
     */
    private String name;
    private double hours;
    private double rate;
    private Address[] addresses;

    public Employee(String name, double hours, double rate, Address[] addresses){
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.addresses = addresses;
    }

    /**
     * Creating getters and setters for the variables in the class. 
     */
    public String getName(){
        return name;
    }

    public void setName(String x){
        this.name = x;
    }

    public double getHours(){
        return hours;
    }

    public void setHours(double x){
        this.hours = x;
    }

    public double getRate(){
        return rate;
    }

    public void setRate(double x){
        this.rate = x;
    }

    public Address[] getAddress(){
        return addresses;
    }

    public void setAddress(Address[] info){
        this.addresses = info;
    }
}
