import java.util.Scanner;

public class StdinStdoutII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Double b = scan.nextDouble();
		scan.nextLine();
		String c = scan.nextLine();
		scan.close();

        System.out.println("String: " + c);
		System.out.println("Double: " + b);
		System.out.println("Int: " + a);
	    }
}