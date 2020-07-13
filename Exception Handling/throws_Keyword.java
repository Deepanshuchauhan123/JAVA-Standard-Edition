public class throws_Keyword{

    public static void n() throws IOException {
        throw new IOException("Device Error");
    }

    public static void m() throws IOException {
        n();
    }

    public static void p() throws IOException {
        m();
    }

    public static void main(String[] args) {
        try {
            p();
        } catch (Exception e) {
            System.out.println(e+"\nException Handeled");
        }
        System.out.println("Normal Flow");
    }
}