/*
 * Created on Oct 28, 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package lk.inli.assignment1;

/**
 * @author Indika Liyanage
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Airplane extends Vehicle implements Driveable, Refuelable {
	private int flyHeight;
    private boolean domesticOrInternational;
    
	/**
     * Default constructor
     */
    public Airplane() {
        super();
    }
    

    /**
     * Constructor which will accept flyHeight also
     * @param brand
     * @param age
     * @param flyHeight
     */
    public Airplane(String brand, int age, int flyHeight) {
        super(brand, age);
        this.flyHeight = flyHeight;
    }

    /**
     * @param type
     * @param enginNo
     * @param weight
     * @param flyHeight flyHeight of the plane
     * @param domesticOrInternational 
     */
    public Airplane(String brand, int age, float weight, 
            int flyHeight, boolean domesticOrInternational) {
        super(brand, age, weight);
        this.flyHeight = flyHeight;
        this.domesticOrInternational = domesticOrInternational;
    }

	/**
	 * @return Returns the flyHeight.
	 */
	public int getFlyHeight() {
		return flyHeight;
	}
	/**
	 * @param flyHeight The flyHeight to set.
	 */
	public void setFlyHeight(int flyHeight) {
		this.flyHeight = flyHeight;
	}
	/**
	 * @return Returns the domesticOrInternational.
	 */
	public boolean isDomesticOrInternational() {
		return domesticOrInternational;
	}
	/**
	 * @param domesticOrInternational The domesticOrInternational to set.
	 */
	public void setDomesticOrInternational(boolean domesticOrInternational) {
		this.domesticOrInternational = domesticOrInternational;
	}
	
	/* 
     * Will return the machanism used to move the airplane
	 * @see lk.inli.assignment1.Driveable#howItMove()
	 */
	public String howItMove() {
		return "By sucking cool air and emitting the hot air through the jet engines";
	}

	/* 
     * The capacity of the fuel tank. Normally Bues have very large tank
	 * @see lk.inli.assignment1.Refuelable#getFuelTankCapacity()
	 */
	public double getFuelTankCapacity() {
		return 10000;
	}

}
