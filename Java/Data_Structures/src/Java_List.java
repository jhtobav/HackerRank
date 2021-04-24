import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Java_List {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=s; i++)
            list.add(scan.nextInt());

        s = scan.nextInt();

        for(int i=1; i<=s; i++){
            String query = scan.next();
            switch (query){
                case "Insert":
                    list.add(scan.nextInt(), scan.nextInt());
                    break;
                case "Delete":
                    list.remove(scan.nextInt());
                    break;
            }
        }

        System.out.println(list.stream().map(v -> v.toString()).reduce((a, b) -> a.concat(" ").concat(b)).get());
    }

}
