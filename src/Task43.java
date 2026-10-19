import java.util.*;

public class Task43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();

        Arrays.sort(a);
        System.out.println("min: " + a[0] + ", max: " + a[a.length - 1]);
    }
}