public class Person {
    // Instance variables: every person has a first name and last name
    private String firstName;
    private String lastName;

    // Constructor: creates a Person with the given first name and last name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Default Constructor: creates a generic person
    public Person() {
        this.firstName = "John";
        this.lastName = "Smith";
    }

    // doSomething(): an example of a non-static method for the Person class.
    //                This method just prints out a message saying something a 
    //                normal person might say
    public void doSomething(int numHours) {
        System.out.println("I'm watching Netflix for " + numHours + " hours.");
    }

    // toString(): retuns a String representation of a Person (their full name)
    public String toString() {
        String str = firstName + " " + lastName;
        return str;
    }

    // getters: return the values of the instance variables
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    // setters: changes the value of the instance variables
    public void setFirstName(String firstName) {
        if (firstName.trim().length() != 0) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName.trim().length() != 0) {
            this.lastName = lastName;
        }
    }
}