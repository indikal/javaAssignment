/*
 * Test class to demonstrate the assignment 1.
 * This is just to demonstrate the main features and so didn't
 * conserned in all aspect like error handling, perfect way of coding etc.
 * <p>
 * <a href="TestAssignment1.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment1;

/**
 * @author inli
 *
 */
public class TestAssignment1 {
    public static void main(String[] args) {
        System.out.println("Creating two cars. Brand:Age;Fuel Type --> Toyota:2:Petrol, Nizan:2:Petrol");
        Car car1 = new Car("Toyota", 2, "Petrol");
        Car car2 = new Car("Nizan", 2, "Petrol");
        
        System.out.println("\nCreating a bus. Brand:Age:No Of Seats --> Tata:5:20");
        Bus bus1 = new Bus("Tata", 5, 20);
        
        System.out.println("\nCreating a bicycle. Brand:Age:Category --> Hunter:1:Sports, Lumala:2:Standard");
        Bicycle bicycle1 = new Bicycle("Hunter", 1, "Sports");
        Bicycle bicycle2 = new Bicycle("Lumala", 2, "Standard");
        
        System.out.println("\nCreating a airplane. Brand:Age:Fly Height --> AirBus:3:10000");
        Airplane airplane1 = new Airplane("AirBus", 3, 10000);
        
        System.out.println("\nCreating a driver. FName:LName:LicenceNo --> Sunil:Perera:12345678");
        Driver driver1 = new Driver("Sunil", "Perera", "12345678");
        
        System.out.println("\nCreating a passenger. FName:LName:TravelBy --> Nimal:Kumara:(Toyota:2:Petrol)");
        Passenger passenger1 = new Passenger("Nimal", "Kumara", car1);
        
        System.out.println("\nAdd two more vehicles to the passenger's travel by list. Tata:5:20, Hunter:1:Sports");
        System.out.println("Here you add a Bus and a Bicycle to a Vehicle list");
        passenger1.addVehicle(bus1);
        passenger1.addVehicle(bicycle1);
        
        System.out.println("\nGo through the passenger's travel by vehicle list and checck " +
                "\nwhether they are Driveable or Refuelable and print the method calls");
        
        for (int i=0; i<passenger1.getTravelBy().size(); i++) {
            System.out.println("\nVehicle found in the list is: " +
                    ((Vehicle) passenger1.getTravelBy().get(i)).getBrand() + ":" +
                    ((Vehicle) passenger1.getTravelBy().get(i)).getAge());
            
            if (passenger1.getTravelBy().get(i) instanceof Driveable) {
                System.out.println("It is driveable");
                System.out.println("How does it move? " +
                        ((Driveable) passenger1.getTravelBy().get(i)).howItMove());
            } else {
                System.out.println("It is NOT driveable");
            }
            
            if (passenger1.getTravelBy().get(i) instanceof Refuelable) {
                System.out.println("It is refuelable");
                System.out.println("Fuel tank capacity: " + ((Refuelable) passenger1.getTravelBy().get(i)).getFuelTankCapacity());
            } else {
                System.out.println("It is NOT refuelable");
            }
        }
    }
}
