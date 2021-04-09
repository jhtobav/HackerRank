import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
		java.util.Map<Character, Integer> counter = new java.util.HashMap<>();
		
		// Complete the function
		
        if(a.length() != b.length())
            return false;
        
        a = a.toUpperCase();
        b = b.toUpperCase();
        char[] stringA = a.toCharArray();
        char[] stringB = b.toCharArray();
        
        for(int i=0; i<=a.length()-1; i++)
            if(counter.containsKey(stringA[i]))
                counter.put(stringA[i], counter.get(stringA[i])+1);
            else
                counter.put(stringA[i], 1);
        
        for(int i=0; i<=b.length()-1; i++){
            if(counter.containsKey(stringB[i])){
                counter.put(stringB[i], counter.get(stringB[i])-1);
                if(counter.get(stringB[i]) < 0)
                    return false;
            } else {
                return false;
            }
        }

        for(java.util.Map.Entry<Character, Integer> entry: counter.entrySet())
            if(entry.getValue() != 0)
                return false;
    
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}