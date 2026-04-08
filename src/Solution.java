import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read the integer N
        int N = scanner.nextInt();
        // TODO: Create a HashSet to store the integers
        Set<Integer> set = new HashSet<>();
        // TODO: Loop N times to read the integers and add them to the HashSet
        for(int i=0;i<N;i++){
          set.add(scanner.nextInt());
        }
        // TODO: Iterate through the HashSet and print the unique numbers (space-separated)
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        for(int i = 0; i < set.size(); i++) {
           System.out.print(list.get(i));
           if(i!= set.size()-1) System.out.print(" ");
        }
        scanner.close();
    }
}
