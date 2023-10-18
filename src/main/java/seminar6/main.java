package seminar6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // создаём два списка
        List<Double> listFirst = new ArrayList<>(Arrays.asList(3.4, 5.0, 7.0));
        List<Double> listSecond = new ArrayList<>(Arrays.asList(9.0, 4.0, 2.0));

        // находим среднее значение
        ListProcessing listProcessing = new ListProcessing();
        Double averageValueFirst = listProcessing.averageValue(listFirst);
        Double averageValueSecond = listProcessing.averageValue(listSecond);

        System.out.printf("Среднее значение первого листа: " + "%.3f", averageValueFirst);
        System.out.println();
        System.out.printf("Среднее значение первого листа: " + "%.3f", averageValueSecond);
        System.out.println();
        // сравниваем среднее значение списков
        System.out.println(listProcessing.comparisonOfAverages(averageValueFirst, averageValueSecond));
    }
}
