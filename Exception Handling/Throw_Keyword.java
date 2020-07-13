public class Throw_Keyword{

    public static void main(String[] args) {
        System.out.println("Enter Age for Vote");
        int age = 16;
        if (age < 18) {
            throw new ArithmeticException("Not a suitable Candidate");
        } else {
            System.out.println("Welcome to Elections");
        }
        System.out.println("Rest of the Code");
    }
}