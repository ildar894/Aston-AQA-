public class CompareNumbers {
    public static String compare(int a, int b) {
        if (a > b) return a + " больше " + b;
        if (a < b) return a + " меньше " + b;
        return a + " равно " + b;
    }
}