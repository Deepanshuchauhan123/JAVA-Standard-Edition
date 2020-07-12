public class Nested_try_Catch_blocks{

    public static void main(String[] args) {
        try {
            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

            try {
                int i = Integer.parseInt("Hello");
            } catch (NumberFormatException e) {
                System.out.println(e);
                int z = 10 / 0;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("PArent of all exception : " + e);
        }
        System.out.println("Rest of the Code");
    }
}