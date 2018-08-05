Assignments
...

**Assignment 1 – OO Principles**

Implement the following classes with a few attributes of your own
choice:

Vehicle, Car, Bus, Driver, Person, Passenger, Bicycle, Airplane

Also implement the following interfaces with one method of your own
choice, and use them for the appropriate classes:

Driveable, Refuelable

The solution should clearly demonstrate the relations between these
entities.

The purpose of the assignment is that you should demonstrate that you
understand the OO principles of encapsulation, inheritance and
polymorphism.

**Assignment 2 – Sorting**

Given the class Car below, extend that class with whatever you find
necessary and add implementations to the methods in the class CarSorter.
When done, you should be able to pass an array or List of Car objects to
the methods in CarSorter to return a sorted dito. The sorting should be
done alphabetically on the attribute ”brand”. Write a test class that
demonstrates a couple of example sortings.

The purpose of the assignment is that you should demonstrate your
understanding of the general and essential mechanizms i the Java
language.

Ex:

CarSorter.sortCarArray(new Car\[\]{new Car(”Toyota”), new Car(”Mazda”),
new Car(”BMW”)});

Should give the following sort order: ”BMW”, ”Mazda”, ”Toyota”.

public class Car

{

private String brand; //Ex: "Toyota"

private int age; //Ex: 6

public Car(String brand)

{

this.brand = brand;

}

public Car(String brand, int age)

{

this.brand = brand;

this.age = age;

}

public String getBrand()

{

return brand;

}

public void setBrand(String brand)

{

this.brand = brand;

}

public int getAge()

{

return age;

}

public void setAge(int age)

{

this.age = age;

}

public String toString()

{

return brand + " - " + age;

}

}

public class CarSorter

{

public static Car\[\] sortCarArray(Car\[\] carArray)

{

...

}

public static java.util.List sortCarList(java.util.List carList)

{

...

}

}

**Assignment 2b – Non-mandatory assignment**

This assignment is not mandatory, and can be solved if you have time
left or feel that you want to put an extra effort into the assignments.

Create two more methods in the CarSorter class that allows you to
specify which of the attributes in Car you want to sort on, either the
brand or the age.

Ex:

CarSorter.sortCarArrayByAge(new Car\[\]{new Car(”Toyota”, 2), new
Car(”Mazda”, 4), new Car(”BMW”, 3)});

Should give the following sort order: ”Toyota”, ”BMW”, ”Mazda”.

**Assignment 3 – Remote access** DONE

You need an internet connection to solve this assignment.

Create a java application that connects to the ”http://www.marakanda.se”
web-site, and prints the contents of the HTTP response’s header and body
to the console (system.out). The body should contain something like
&lt;html&gt;...&lt;/html&gt;

**Assignment 4 – Java I/O**

Create a java application that *recursively* traverses the file tree in
a given directory and looks for files of a given type (for example
.java-files), counts the number of lines in all files of the given type
and presents the total number of lines of code in the given directory
and all it´s subdirectories.

Arguments to the program:

1.  Relative or absolute path to a directory, ex: ”c:/java/temp”, or
    ”../temp”

2.  File extension, ex: ”.txt”, or ”.java”.

Example output:

&gt;java Assignment4 c:/temp .java

Total number of lines: 143621

Out of scope:

No need to support binary file types.
