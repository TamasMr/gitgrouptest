
public class Dtest {
    public static void main(String[] args) {
        future("Cancer");
        Atest.greet("Tamás");
        Btest.count(28);
        CTest.cheer();
    }

    private static void future(String horoscopeSign) {
        System.out.println(horoscopeSign);
    }
}
