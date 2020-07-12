public class Array_Out_of_Bound_Exception{

    public static void main(String[] args) {
        try {
            int array[]=new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Rest of the Code");
    }
}