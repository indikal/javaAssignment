/*
 * General class to represent any kind of Bus.
 * This will inherit from the Vehicle class
 * <p>
 * <a href="Bus.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment1;

/**
 * @author inli
 */
public class Bus extends Vehicle implements Driveable, Refuelable {
    private int noOfSeats;
    private String route;

    /**
     * Default constructor
     */
    public Bus() {
        super();
    }
    /**
     * Constructor which will accept noOfSeats also
     * @param brand
     * @param age
     * @param noOfSeats
     */
    public Bus(String brand, int age, int noOfSeats) {
        super(brand, age);
        this.noOfSeats = noOfSeats;
    }

    /**
     *@param brand
     * @param age
     * @param weight
     * @param noOfSeats
     * @param route
     */
    public Bus(String brand, int age, float weight, int noOfSeats, String route) {
        super(brand, age, weight);
        this.noOfSeats = noOfSeats;
        this.route = route;
    }
    
	/**
	 * @return Returns the noOfSeats.
	 */
	public int getNoOfSeats() {
		return noOfSeats;
	}
	/**
	 * @param noOfSeats The noOfSeats to set.
	 */
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	/**
	 * @return Returns the route.
	 */
	public String getRoute() {
		return route;
	}
	/**
	 * @param route The route to set.
	 */
	public void setRoute(String route) {
		this.route = route;
	}
	/*
     * Will return the machanism used to move the car
	 * @see lk.inli.assignment1.Driveable#howItMove()
	 */
	public String howItMove() {
		return "By rotating the four rear wheels via the help of an axil";
	}
	/*
     * The capacity of the fuel tank. Normally Bues have fairly large tank
	 * @see lk.inli.assignment1.Refuelable#getFuelTankCapacity()
	 */
	public double getFuelTankCapacity() {
		return 100;
	}
}
