private class Employee {
    private String name;
    private double hours;
    private double rate;

    public Employee(String name, double hours, double rate){
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }

    public String getName(){
        return name;
    }

    public String setName(String x){
        this.name = x;
    }

    public double getHours(){
        return hours;
    }

    public double setHours(double x){
        this.hours = x;
    }

    public double getRate(){
        return rate;
    }

    public double setRate(double x){
        this.rate = x;
    }
}
