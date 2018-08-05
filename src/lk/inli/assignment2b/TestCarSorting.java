/*
 * Test class for testing sortCarArrayByBrand and sortCarArrayByAge
 * <p>
 * <a href="TestCarSorting.java.html">View source</a>
 * </p>
 * 
 * @author Indika Liyanage
 * @version $Revision: $ $Date: $
 */
package lk.inli.assignment2b;


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
        
        Car[] carArray1 = {car1,car2,car3,car4,car5,car6,car7,car8,car9,car10};
        Car[] carArray2 = {car1,car2,car3,car4,car5,car6,car7,car8,car9,car10};
        
        Car[] carByBrand = CarSorter.sortCarArrayByBrand(carArray1);
        Car[] carByAge = CarSorter.sortCarArrayByAge(carArray2);
        
        System.out.println("Sorted list by brand name ... \n");
        for (int i=0; i<carByBrand.length; i++)
            System.out.println((Car) carByBrand[i]);
        
        System.out.println("\nSorted list by age ... \n");
        for (int i=0; i<carByAge.length; i++)
            System.out.println(carByAge[i]);
    }

}
