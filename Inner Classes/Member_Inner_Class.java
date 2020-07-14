/*
Java Member inner class ::
A non-static class that is created inside a class but outside a method is called member inner class.
*/

public class Member_Inner_Class{
    private int data = 10;

    public static void main(String[] args) {
        Member_Inner_Class obj = new Member_Inner_Class();
        Member_Inner_Class.InnerClass inobj = obj.new InnerClass();
        inobj.message();
    }

    class InnerClass {
        void message() {
            System.out.print("Data is " + data);
        }
    }
}