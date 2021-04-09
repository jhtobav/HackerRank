import java.io.*;
import java.util.*;

public class Java_Arraylist {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        ArrayList<ArrayList<Integer>> array = new ArrayList<>();

        for(int i = 1; i <= a; i++){
            int b = scan.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();
            for(int j = 0; j < b; j++){
                numbers.add(scan.nextInt());
            }
            array.add(numbers);
        }

        a = scan.nextInt();

        for(int i = 1; i<=a; i++){
            try {
                System.out.println(array.get(scan.nextInt()-1).get(scan.nextInt()-1));
            } catch(IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }
        }
    }

}
