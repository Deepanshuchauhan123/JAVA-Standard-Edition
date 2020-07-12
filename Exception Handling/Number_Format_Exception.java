public class Number_Format_Exception{

    public static void main(String[] args) {
        try {
            String s = "Number Format Exception";
            int n=Integer.parseInt(s);
            System.out.println(n);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("Rest of the Code");
    }
}