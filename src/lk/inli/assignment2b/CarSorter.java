/*
 * The Comparable and Comparator interfaces could be used to sort Arrays and Lists.
 * <p> <a href="CarSorter.java.html">View source </a> </p>
 * 
 * @author Indika Liyanage
 * 
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment2b;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class CarSorter {
    public static Car[] sortCarArray(Car[] carArray) {
        Arrays.sort(carArray);
        return carArray;
    }

    public static java.util.List sortCarList(java.util.List carList) {
        Collections.sort(carList);
        
        return carList;
    }
    
    public static Car[] sortCarArrayByAge(Car[] carArray) {
        Comparator com = new Comparator() {
            public int compare(Object o1, Object o2) {
                Car car1 = null, car2 = null;
                //this was done just for the safe execution. no crashes
                if (o1 instanceof Car) { 
                    car1 = (Car) o1;
                } else {
                    return -1;
                }
                if (o2 instanceof Car) { 
                    car2 = (Car) o2;
                } else {
                    return -1;
                }
                
                int isEqual = (car1.getAge() == car2.getAge()) ? 0 : 
                    ((car1.getAge() > car2.getAge()) ? 1 : -1); 
                
                return isEqual;
            };};
        Arrays.sort(carArray, com);
        return carArray;
    }
    
    public static Car[] sortCarArrayByBrand(Car[] carArray) {
        Comparator com = new Comparator() {
            public int compare(Object o1, Object o2) {
                Car car1 = null, car2 = null;
                //this was done just for the safe execution. no crashes
                if (o1 instanceof Car) { 
                    car1 = (Car) o1;
                } else {
                    return -1;
                }
                if (o2 instanceof Car) { 
                    car2 = (Car) o2;
                } else {
                    return -1;
                }
                
                int isEqual = car1.getBrand().compareTo(car2.getBrand()); 
                
                return isEqual;
            };};
        Arrays.sort(carArray, com);
        return carArray;
    }
}