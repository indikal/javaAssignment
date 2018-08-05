/*
 * 
 * <p> <a href="Car.java.html">View source </a> </p>
 * 
 * @author Indika Liyanage
 * 
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment2b;

public class Car implements Comparable {
    private String brand; //Ex: "Toyota"

    private int age; //Ex: 6

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, int age) {
        this.brand = brand;
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return brand + " - " + age;
    }

    /**
     * This method is required for the comparable to work correctly
     * @see java.lang.Object#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof Car)) {
            return false;
        }
        Car car = (Car) object;
        boolean isEqual = false;
        isEqual = ((this.brand.equalsIgnoreCase(car.brand)) && (this.age == car.age)) ? true : false; 
        
        return isEqual;
    }
    
    /**
     * This is required for the Comparable to work correctly
     * @see java.lang.Object#hashCode()
     */
    public int hashCode() {
        return this.toString().hashCode();
    }
    
    /**
     * If the current instanse, this comes before the parameter element, 
     * o in the ordering, a negative value is returned. 
     * If the current instanse, this comes after, 
     * then a positive value is returned. Otherwise, zero is returned.
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Object o) {
        return this.toString().compareTo(((Car)o).toString());
    }
}