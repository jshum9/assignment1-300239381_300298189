public class Address{
    
    /**
     * Creating variables displayed in memory diagram. 
     */

    private String street;
    private int number;
    private String postal;

    public Address(String street, int number, String postal){
        this.street = street;
        this.number = number;
        this.postal = postal;
    }

    /**
     * Creating getters and setters for the variables in the class. 
     */

    public String getStreet(){
        return street;
    }

    public void setStreet(String x){
        this.street = x;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int x){
        this.number = x;
    }

    public String getPostal(){
        return postal;
    }

    public void setPostal(String x){
        this.postal = x;
    }

    /**
     * Create toString() method for class Address
     */

     public String toString(){
        return "Street: " + street + ", Number: " + number + ", Postal Code: " + postal;
     }
}
