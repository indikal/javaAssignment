/*
 * This will represent a driver and will inherit every thing from the Person class
 * <p>
 * <a href="Driver.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment1;

import java.util.Date;

/**
 * @author inli
 *
 */
public class Driver extends Person {
    private String licenceNo;
    
    /**
     * for the category you can also use the Vehicle class but in Sri Lanka
     * category refer to "Light Vehicles, Motor Bicycle, Heavy Vehicle etc
     */
    private String vehicleCategory;
    
    /**
     * Default constructor
     */
    public Driver() {
        super();
    }

    /**
     * Constructor to accept only the mandatory fields
     * @param firstName
     * @param lastName
     * @param licenceNo
     */
    public Driver(String firstName, String lastName, String licenceNo) {
        super(firstName, lastName);
        this.licenceNo = licenceNo;
    }

    /**
     * Complete constructor
     * @param firstName
     * @param lastName
     * @param dob
     * @param email
     * @param licenceNo
     * @param vehicleCategory
     */
    public Driver(String firstName, String lastName, Date dob, String email,
            String licenceNo, String vehicleCategory) {
        super(firstName, lastName, dob, email);
        this.licenceNo = licenceNo;
        this.vehicleCategory = vehicleCategory;
    }

    /**
     * Return driving licence no
     * @return Returns the licenceNo.
     */
    public String getLicenceNo() {
        return licenceNo;
    }
    /**
     * Set driving licence no
     * @param licenceNo The licenceNo to set.
     */
    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }
    /**
     * return Vehicle Category
     * @return Returns the vehicleCategory.
     */
    public String getVehicleCategory() {
        return vehicleCategory;
    }
    /**
     * set Vehicle Category
     * @param vehicleCategory The vehicleCategory to set.
     */
    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }
}
