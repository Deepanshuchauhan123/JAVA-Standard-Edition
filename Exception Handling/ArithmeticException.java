public class ArithmeticException{

    public static void main(String[] args) {
        try {
            int c = 2 / 0;
            System.out.println(c);
            } catch (ArithmeticException e)
                {
                    System.out.println(e);
                }
        System.out.println("Rest of the Code");
    }
}