package ListOperations;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ListOperationsTest {
    @Test
    public void sumListsTest() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> result = new ArrayList<>(Arrays.asList(2, 4, 6));
        List<Integer> resultTest = ListOperations.sumLists(list1, list2);
        assertEquals(result, resultTest, "метод работает не правильно");


    }

    @Test
    public void findMaxTest() {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 4, 2));
        int results = ListOperations.findMax(list1);
        assertEquals(4, results, "Метод работает с ошибкой!");
    }
    @Test
    public void filterStringsTest(){
        List<String> words = new ArrayList<>(Arrays.asList("Hello", "World", "my","test"));
        List<String> result = new ArrayList<>(Arrays.asList("Hello", "World", "test"));
        List<String> resultTest = ListOperations.filterStrings(words,4);
        assertEquals(result,resultTest,"метод отработал правильно");
    }

}
