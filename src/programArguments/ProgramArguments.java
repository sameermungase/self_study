
package programArguments;

import java.util.Arrays;

public class ProgramArguments {
    public static void main(String... args) {
        System.out.println(Arrays.toString(args));
 int a = Integer.parseInt(args[0]);
        System.out.println(a);

        int[] a1={10,20};
        int[] a2={10,20};
        System.out.println(a1==a2);
        System.out.println(Arrays.equals(a1, a2));
    }
}
