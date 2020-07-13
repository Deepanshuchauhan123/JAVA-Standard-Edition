/*
An exception is first thrown from the top of the stack and if it is not caught,
 it drops down the call stack to the previous method,If not caught there, 
the exception again drops down to the previous method, and so on until 
they are caught or until they reach the very bottom of the call stack.
This is called exception propagation.

*/

public class Exception_Propagation{

    public static void n() {
        int x = 10 / 0;
    }

    public static void m() {
        n();
    }

    public static void p() {
        m();
    }

    public static void main(String[] args) {
        try {
            p();
        } catch (Exception e) {
            System.out.println("Exception Handeled");
        }
        System.out.println("Normal Flow");
    }
}