/*
 * This will represent a general person and it will be possible to extend in
 * other child classes. So, only the general properties and methids will be
 * implimented here
 * <p>
 * <a href="Person.java.html">View source</a>
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
public class Person {
    private String firstName;
    private String lastName;
    private Date dob;
    private String email;
    
    
    /**
     * The default constructor with no parameters
     */
    public Person() {
    }
    
    /**
     * Constructor which will take only the name
     * @param firstName
     * @param lastName
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    /**
     * The complete constructor which will acept all properties
     * @param firstName
     * @param lastName
     * @param dob
     * @param email
     */
    public Person(String firstName, String lastName, Date dob, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.email = email;
    }
    
    /**
     * Getter for the First Name
     * @return Returns the firstName.
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Setter for the First Name
     * @param firstName The firstName to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Getter for the Larst Name
     * @return Returns the lastName.
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Setter for the Larst Name
     * @param lastName The lastName to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Getter for Date of Birth
     * @return Returns the dob.
     */
    public Date getDob() {
        return dob;
    }
    /**
     * Setter for Date of Birth
     * @param dob The dob to set.
     */
    public void setDob(Date dob) {
        this.dob = dob;
    }
    /**
     * Getter for the Email address
     * @return Returns the email.
     */
    public String getEmail() {
        return email;
    }
    /**
     * Setter for the Email address
     * @param email The email to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Returns the full name of the person
     * @return full name
     */
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }
}
