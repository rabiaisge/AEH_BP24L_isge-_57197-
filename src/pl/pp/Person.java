package pl.pp;

public class Person {
    // Fields (attributes) of the class defining the object "Person"
    public String forename;
    public String surname;
    public int age;
    public String address; // NEW field: address
    public int year_of_birth; // NEW field: year of birth

    // Default constructor
    public Person() {
    }

    // Constructor with three parameters
    public Person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }

    // Class methods

    // Print information about the person
    public void hiToAll() {
        System.out.println("My name is " + forename + " " + surname + ". " + "I am " + age + " years old.");
    }

    // Method growOld, now takes a parameter to increase the age
    public void growOld(int years) {
        age = age + years;
    }

    // Method to make the person younger by 1 year
    public void beYounger() {
        age = age - 1;
    }

    // Method to get the forename
    public String getName() {
        return forename;
    }

    // Method to set the forename
    public void setName(String nameToSet) {
        forename = nameToSet;
    }

    public void growOld() {
    }
}


