package pl.pp;

public class Person {
    // Fields (attributes)
    public String forename;
    public String surname;
    public int age;
    public String address;
    public int year_of_birth;

    // Default constructor
    public Person() {
    }

    // Constructor with parameters
    public Person(String initForename, String initSurname, int initAge, String initAddress, int initYearOfBirth) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        address = initAddress;
        year_of_birth = initYearOfBirth;
    }

    // Method to introduce person
    public void hiToAll() {
        System.out.println("My name is " + forename + " " + surname + ". " +
                "I am " + age + " years old. " +
                "I live at " + address + ". " +
                "I was born in " + year_of_birth + ".");
    }

    // Modified growOld method: increase age by given number
    public int growOld(int years) {
        age = age + years;
        return age;
    }

    // New beYounger method: decrease age by 1
    public int beYounger() {
        age = age - 1;
        return age;
    }

    // Method to get forename
    public String getName() {
        return forename;
    }

    // Method to set forename
    public void setName(String nameToSet) {
        forename = nameToSet;
    }
}
