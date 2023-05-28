public class Test {
    public static void main(String[] args){

        //Create Address objects

        Address address1 = new Address("Queen", 48, "K1P1N2");
        Address address2 = new Address("King Edward", 800, "K1N6N5");

        //Create an array of addresses with 6 memory slots as designated in the diagram

        Address[] address = new Address[6];

        //Add new addresses in the slots of the new array

        address[0] = address1;
        address[1] = address2;

        //Create an Employee
        
        Employee employee = new Employee("Faleao", 40, 15.50, address);

        //Print the details of the employee using toString()

        System.out.println(employee);
    }
}
