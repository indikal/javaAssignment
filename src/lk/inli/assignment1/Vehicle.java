/*
 * General class to represent any kind of a vehicle
 * <p>
 * <a href="Vehicle.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment1;

/**
 * @author inli
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Vehicle {
    private String brand;
    private int age;
    private float weight;
    
    /**
     * Default constructor
     */
    public Vehicle() {
        super();
    }
    
    /**
     * constructor accepting vehicle brand and age only
     * @param brand
     * @param age
     */
    public Vehicle(String brand, int age) {
        this.brand =brand;
        this.age = age;
    }

    /**
     * constructor accepting all properties
     * @param brand
     * @param age
     * @param weight
     */
    public Vehicle(String brand, int age, float weight) {
        this.brand = brand;
        this.age = age;
        this.weight = weight;
    }
    /**
     * Getter for vehicle brand
     * @return Returns the brand.
     */
    public String getBrand() {
        return brand;
    }
    /**
     * Setter for vehicle brand
     * @param brand The brand to set.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    /**
     * Getter for age
     * @return Returns age.
     */
    public int getAge() {
        return age;
    }
    /**
     * Setter for age
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Getter for Vehicle Weight
     * @return Returns the weight.
     */
    public float getWeight() {
        return weight;
    }
    /**
     * Setter for Vehicle Weight
     * @param weight The weight to set.
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }
}
