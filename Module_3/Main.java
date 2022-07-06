//Paul Caron
//6-8-2022
//Module 3 Assignment
/*
An int data field titled with your first name.
A constructor that takes and sets the initial value.
Getter and setter methods.
Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or false based on the variable’s value.
Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with the same basic logic as the previous methods with results based on the parameter.
Static methods with signatures isEven( Integer), isOdd( Integer), and isPrime( Integer) with the same basic logic as the previous methods with results based on the parameter.
The methods equals(int) and equals( Integer) which returns true if int values are equal and false if they are not.
Write test code that creates three instances, two with the same value, and one with a different value.
Write test code that ensures all methods function correctly.
*/

public class Main {
    public static void main(String[] args) {
        // create an instance of the class for the test code
        PaulInteger intOne = new PaulInteger(11);
        PaulInteger intTwo = new PaulInteger(44);
        PaulInteger intThree = new PaulInteger(91);

        // print out the value of MyInteger instance intOne and tests if it is even or odd
        System.out.println("This is the first int " + intOne.getValue() + ", is it even? The answer is " + intOne.isEven() + ".");
        // print out the value of intTwo and tests for odd or even
        System.out.println("Is integer two: " + intTwo.getValue() + " Odd? " + intTwo.isOdd());
        // prints out if int two and int one is prime or not
        System.out.println("Is int two prime?: " + intTwo.isPrime() + " \nIs the first integer prime?: " + intOne.isPrime());
        // prints out int three
        System.out.println("Int three: " + intThree.getValue());
        // prints out int three value and asks if it is equal to int one with a true or false answer
        System.out.println("Is int three " + intThree.getValue() + " equal to the first integer " + intOne.getValue() + ", answer is: " + intTwo.equals(intOne));
    }
}