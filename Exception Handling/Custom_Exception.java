/*
Custom Exception::

	If you are creating your own Exception that is known as custom
	exception or user-defined exception. Java custom exceptions are 
	used to customize the exception according to user need.

By the help of custom exception, you can have your own exception and message.
*/

class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
}

public class Custom_Exception{

    static void validate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not valid");
        } else {
            System.out.println("Welcome to Vote");
        }

    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (Exception m) {
            System.out.println("Exception  " + m);
        }
        System.out.println("Rest of the code");
    }
}