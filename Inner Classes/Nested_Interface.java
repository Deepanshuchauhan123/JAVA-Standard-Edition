/*
Nested Interface:: 

An interface i.e. declared within another interface or class is known as nested interface.
The nested interfaces are used to group related interfaces so that they can be easy to maintain. 
The nested interface must be referred by the outer interface or class.
It can't be accessed directly.

*/

interface person {
    interface message {
        void msg();
    }
}

public class Nested_Interface implements person.message {
    public static void main(String[] args) {
        person.message m = new Nested_Interface();
        m.msg();
    }

    @Override
    public void msg() {
        System.out.println("Here is a Message");
    }
}