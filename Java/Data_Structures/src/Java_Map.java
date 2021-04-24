import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class Java_Map {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());

        Map<String, String> phone_book = new HashMap<>();

        for(int i = 1; i <= a; i++)
            phone_book.put(scan.nextLine(), scan.nextLine());

        while(scan.hasNext()) {
            String name = scan.nextLine();
            String phone = phone_book.getOrDefault(name, "Not found");
            if(phone == "Not found")
                System.out.println("Not found");
            else
                System.out.println(name.concat("=").concat(phone));
        }
    }

}
