/*
 * Test class for testing sortCarArray and sortCarList
 * <p>
 * <a href="TestCarSorting.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author inli
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class TestCarSorting {

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 10);
        Car car2 = new Car("Nizan", 15);
        Car car3 = new Car("Mazda", 10);
        Car car4 = new Car("BMW", 5);
        Car car5 = new Car("Peguot", 6);
        Car car6 = new Car("Toyota", 8);
        Car car7 = new Car("Toyota", 12);
        Car car8 = new Car("Mazda", 7);
        Car car9 = new Car("BMW", 10);
        Car car10 = new Car("Nizan", 8);
        
        Car[] carArray = {car1,car2,car3,car4,car5,car6,car7,car8,car9,car10};
        List carList = new ArrayList();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        
        carArray = CarSorter.sortCarArray(carArray);
        carList = CarSorter.sortCarList(carList);
        
        System.out.println("Sorted array of cars ... \n");
        for (int i=0; i<carArray.length; i++)
            System.out.println((Car) carArray[i]);
        
        System.out.println("Sorted list of cars ... \n");
        for (int i=0; i<carList.size(); i++)
            System.out.println((Car) carList.get(i));
    }

}
