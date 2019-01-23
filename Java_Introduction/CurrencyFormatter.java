import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
		
		// Write your code here.
		Locale indiaLocale = new Locale("en", "IN");
		
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
		String us = numberFormat.format(payment);
		
		numberFormat = NumberFormat.getCurrencyInstance(indiaLocale);
		String india = numberFormat.format(payment);
		
		numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String china = numberFormat.format(payment);
		
		numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String france = numberFormat.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
	
}