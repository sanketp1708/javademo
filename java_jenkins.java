public class CustomPrint {

    // Overloaded print methods for different data types
    public static void print(String message) {
        System.out.println("String: " + message);
    }

    public static void print(int number) {
        System.out.println("Integer: " + number);
    }

    public static void print(double number) {
        System.out.printf("Double: %.2f%n", number);
    }

    public static void print(String message, int number) {
        System.out.println("String: " + message + ", Integer: " + number);
    }

    public static void print(String message, double number) {
        System.out.printf("String: %s, Double: %.2f%n", message, number);
    }

    public static void print(String message, int number, double decimal) {
        System.out.printf("String: %s, Integer: %d, Double: %.2f%n", message, number, decimal);
    }

    public static void main(String[] args) {
        // Testing the custom print function
        print("Hello, World!");
        print(42);
        print(3.14159);
        print("The answer is", 42);
        print("Pi is approximately", 3.14159);
        print("Values:", 10, 2.71828);
    }
}
