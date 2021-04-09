import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock{
	
	static Scanner sc;
	static int B;
	static int H;
	static boolean flag;
	
	static {
		sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		flag = true;
		if(B<=0 || H<=0){
			flag = false;
			System.out.print("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class