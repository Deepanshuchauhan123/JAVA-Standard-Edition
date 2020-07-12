public class Finally_Block_Case1{

    public static void main(String[] args) {
        try {
            int a = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("PArent of all exception : " + e);
        } finally {
            System.out.println("Finally block is executed");
        }
        System.out.println("Rest of the Code");
    }
}