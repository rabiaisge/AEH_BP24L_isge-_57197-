package pl.pp;

public class mySeventhApp {
    public static void main(String[] args) {
        // create object person1 of class Person with 5 parameters
        Person person1 = new Person("Alice", "Hart", 42, "New York", 1982);
        person1.hiToAll(); // Display initial information

        // change fields manually
        person1.forename = "John";
        person1.surname = "Doe";
        person1.age = 24;
        person1.address = "Los Angeles";
        person1.year_of_birth = 2001;
        person1.hiToAll(); // Display updated information

        // create another person object
        Person person2 = new Person("Alice", "Hart", 42, "London", 1982);
        person2.hiToAll();

        // use growOld() method with parameter
        person1.growOld(1); // person1 yaşını 1 artır
        for (int i = 0; i < 3; i++) {
            person2.growOld(1); // person2 yaşını 3 defa 1'er artır
        }

        // Show final state after growing old
        person1.hiToAll();
        person2.hiToAll();
    }
}
