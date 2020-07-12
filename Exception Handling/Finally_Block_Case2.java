public class Finally_Block_Case2{

    public static void main(String[] args) {
        try {
            int a = 10 / 0;

        } catch (NumberFormatException e) {
            System.out.println(e);
        } finally {
            System.out.println("Finally block is executed");
        }
        System.out.println("Rest of the Code");
    }
}