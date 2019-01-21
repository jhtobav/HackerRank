import java.util.*;
import java.io.*;

public class LoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int value = a + b;
            System.out.print(value);
            for (int j = 1; j <= n - 1; j++) {
                value = value + ((int)Math.pow(2, j) * b);
                System.out.format(" %d", value);
            }
            System.out.println();
        }
        in.close();
    }
}