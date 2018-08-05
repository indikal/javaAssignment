/*
 * 
 * <p> <a href="CarSorter.java.html">View source </a> </p>
 * 
 * @author Indika Liyanage
 * 
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment2;

import java.util.Arrays;
import java.util.Collections;

public class CarSorter {
    public static Car[] sortCarArray(Car[] carArray) {
        Arrays.sort(carArray);
        return carArray;
    }

    public static java.util.List sortCarList(java.util.List carList) {
        Collections.sort(carList);
        
        return carList;
    }
}