/*
 * This class will represent a Passenger
 * This class will inherit every thing from a Person class
 * <p>
 * <a href="Passenger.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author inli
 *
 */
public class Passenger extends Person {
    private List travelBy;
    
    /**
     * Default constructor
     */
    public Passenger() {
        super();
        this.travelBy = new ArrayList();
    }

    /**
     * Constructor which will accept mandatory fields.
     * Only one vehicle is required at the begining but can keep adding 
     * vehicles using other methods
     * @param firstName
     * @param lastName
     * @param travelBy
     */
    public Passenger(String firstName, String lastName, Vehicle travelBy) {
        super(firstName, lastName);
        this.travelBy = new ArrayList();
        this.travelBy.add(travelBy);
    }

    /**
     * Constructor accepting all properties
     * @param firstName
     * @param lastName
     * @param dob
     * @param email
     * @param travelBy
     */
    public Passenger(String firstName, String lastName, Date dob, 
            String email, Vehicle travelBy) {
        super(firstName, lastName, dob, email);
        this.travelBy = new ArrayList();
        this.travelBy.add(travelBy);
    }

    /**
     * @return Returns the travelBy.
     */
    public List getTravelBy() {
        return travelBy;
    }
    /**
     * @param travelBy The travelBy to set.
     */
    public void setTravelBy(List travelBy) {
        this.travelBy = travelBy;
    }
    
    /**
     * Add a vehicle to the favorit list
     * @return Returns the new travelBy.
     */
    public List addVehicle(Vehicle vehicle) {
        if (null != travelBy) {
            this.travelBy.add(vehicle);
        }
        return travelBy;
    }
    /**
     * Remove a vehicle from the favorite list by vehicle
     * @return Returns the remaining travelBy.
     */
    public List removeVehicle(Vehicle vehicle) {
        if (null != vehicle) {
            this.travelBy.remove(vehicle);
        }
        return travelBy;
    }
}
