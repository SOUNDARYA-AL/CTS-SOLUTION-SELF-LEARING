Custom Exception:


class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) { super(msg); }
}
public class AgeCheck {
    public static void main(String[] args) throws Exception {
        int age = new java.util.Scanner(System.in).nextInt();
        if (age < 18) throw new InvalidAgeException("Age must be at least 18");
        System.out.println("Valid Age");
    }
}