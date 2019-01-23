import java.util.*;
import java.io.*;

public class EndOfFile{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=1;
		while(true){
			if(sc.hasNext()){
				System.out.format("%d %s%n", i, sc.nextLine());
				i++;
			}else{
				break;
			}
		}
    }
}