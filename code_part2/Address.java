private class Address extends Employee{
    private String street;
    private double number;
    private String postal;

    public Address(String street, double number, String postal){
        super(name, hours, rate);
        this.street = street;
        this.number = number;
        this.postal = postal;
    }

    public String getStreet(){
        return street;
    }

    public String setStreet(String x){
        this.street = x;
    }

    public double getNumber(){
        return number;
    }

    public double setNumber(double x){
        this.number = x;
    }

    public String getPostal(){
        return postal;
    }

    public String setPostal(String x){
        this.postal = x;
    }
}
