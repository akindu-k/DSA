import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
    
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < s.length(); i += k) {
            // Use substring to get the part of the string
            if (i + k <= str.length()) {
                result.add(str.substring(i, i + k));
            } 
            else {
                result.add(str.substring(i));
            }
        }

// 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}