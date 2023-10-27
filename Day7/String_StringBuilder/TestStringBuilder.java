package Day8.String_StringBuilder;

import java.util.Date;

public class TestStringBuilder {

    public static void main(String[] args) {

        // inits new SB with specified string and allocates 16 chars
        StringBuilder sb = new StringBuilder("Testing");

        System.out.println(sb); // Testing

        System.out.println("len = " + sb.length() + " Capacity " + sb.capacity());

        StringBuilder sb2 = sb.append(false);
        System.out.println(sb);
        System.out.println(sb2);

        System.out.println(sb == sb2);

        // method chaining
        sb2 = sb.append('c').append(123.45).append(34.567f).append(new Date());
        System.out.println(sb2);
        System.out.println(sb);

        char[] chars = { 'a', 'b', 'c' };

        // insert (int offset, Object O)
        sb.insert(0, chars);
        System.out.println(sb);
        System.out.println(sb.length() + " " + sb.capacity());

        sb.trimToSize(); // tries to reduce capacity = length
        System.out.println(sb.length() + " " + sb.capacity());
    }
}
