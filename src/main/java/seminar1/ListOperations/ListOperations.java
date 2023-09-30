package seminar1.ListOperations;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
       List<Integer> list1 = Arrays.asList(1,2,4);
       List<Integer> list2 = Arrays.asList(1,1,2);
        System.out.println(sumLists(list1,list2));
    }
    public static List<Integer> sumLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            result.add(list1.get(i) + list2.get(i));
        }
        return result;
    }

    public static int findMax(List<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static List<String> filterStrings(List<String> words, int minLength) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= minLength) {
                result.add(word);
            }
        }
        return result;
    }
}
