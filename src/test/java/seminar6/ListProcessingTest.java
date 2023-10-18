package seminar6;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListProcessingTest {
    ListProcessing listProcessing = new ListProcessing();

//    Ожидается что метод вернёт среднее значение списка 4
    @Test
    void averageValue() {
        List<Double> testList = new ArrayList<>(Arrays.asList(4.0,4.0));
        assertEquals(4,listProcessing.averageValue(testList),"метод расчитал не верное среднее значение" );
    }
    // Ожидается что списки равны
    @Test
    void comparisonOfAverages() {
        assertEquals("Средние значения равны",listProcessing.comparisonOfAverages(4.0,4.0));
    }
}