/*
 * As there is no engine to drive and no fuel was used non of the 
 * interfaces were implemented
 * Created on Oct 27, 2005
 *<p>
 * <a href="Bicycle.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment1;

/**
 * @author Indika Liyanage
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Bicycle extends Vehicle {
    private String category; //whether it is a sports, mountain etc
    private int freeWheelerSize;
    
    
    /**
     * Default constructor
     */
    public Bicycle() {
        super();
    }
    /**
     * Constructor which will accept category also
     * @param brand
     * @param age
     * @param category
     */
    public Bicycle(String brand, int age, String category) {
        super(brand, age);
        this.category = category;
    }

    /**
     *@param brand
     * @param age
     * @param weight
     * @param category
     * @param freeWheelerSize
     */
    public Bicycle(String brand, int age, float weight, String category, int freeWheelerSize) {
        super(brand, age, weight);
        this.category = category;
        this.freeWheelerSize = freeWheelerSize;
    }
    
    /**
	 * @return Returns the category.
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category The category to set.
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return Returns the freeWheelerSize.
	 */
	public int getFreeWheelerSize() {
		return freeWheelerSize;
	}
	/**
	 * @param freeWheelerSize The freeWheelerSize to set.
	 */
	public void setFreeWheelerSize(int freeWheelerSize) {
		this.freeWheelerSize = freeWheelerSize;
	}
}
