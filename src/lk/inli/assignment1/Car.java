/*
 * General class to represent any kind of Car.
 * This will inherit from the Vehicle class
 * <p>
 * <a href="Car.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment1;

/**
 * @author inli
 */
public class Car extends Vehicle implements Driveable, Refuelable {
    private String fuelType;
    private String color;

    /**
     * Default constructor
     */
    public Car() {
        super();
    }
    

    /**
     * Constructor which will accept fuelType also
     * @param brand
     * @param age
     * @param fuelType
     */
    public Car(String brand, int age, String fuelType) {
        super(brand, age);
        this.fuelType = fuelType;
    }

    /**
     *@param brand
     * @param age
     * @param weight
     * @param fuelType
     * @param color
     */
    public Car(String brand, int age, float weight, String fuelType, String color) {
        super(brand, age, weight);
        this.fuelType = fuelType;
        this.color = color;
    }

    /**
     * getter for car fuelType
     * @return Returns the fuelType.
     */
    public String getFuelType() {
        return fuelType;
    }
    /**
     * Setter for car fuelType
     * @param fuelType The fuelType to set.
     */
    public void setAge(String fuelType) {
        this.fuelType = fuelType;
    }
    /**
     * Getter for car color
     * @return Returns the color.
     */
    public String getColor() {
        return color;
    }
    /**
     * Setter for car color
     * @param color The color to set.
     */
    public void setColor(String color) {
        this.color = color;
    }
	/*
     * Will return the machanism used to move the car
	 * @see lk.inli.assignment1.Driveable#howItMove()
	 */
	public String howItMove() {
		return "By rotating the two front wheels directly by the engine";
	}
	/*
     * The capacity of the fuel tank. Normally Cars have a smaller tank
	 * @see lk.inli.assignment1.Refuelable#getFuelTankCapacity()
	 */
	public double getFuelTankCapacity() {
		return 40;
	}
}
