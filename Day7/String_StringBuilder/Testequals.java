package Day8.String_StringBuilder;

public class Testequals {

    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        String s3 = new String("Hello");

        System.out.println(s1 == s2);// false
        System.out.println(s1 == s3);// false

        System.out.println(s1.equals(s2));// true
        System.out.println(s1.equals(s3));// false

        System.out.println(s1.equalsIgnoreCase(s3));// true
    }
}
