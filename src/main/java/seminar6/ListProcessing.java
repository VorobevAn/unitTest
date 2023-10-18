package seminar6;


import java.util.List;

public class ListProcessing {

    public ListProcessing() {
    }

    // нахождение среднее значение из списка.

    public Double averageValue(List<Double> list) {
        Double average = 0.0;
        for (int i = 0; i < list.size(); i++) {
            average += list.get(i);
        }
        average = average / list.size();
        return average;
    }

    // сравнение средних списка
    public String comparisonOfAverages(Double averList1, Double averList2) {
        if (averList1 > averList2) {
            return ("Первый список имеет большее среднее значение");
        } else if (averList1 < averList2) {
            return ("Второй список имеет большее среднее значение");
        } else {
            return ("Средние значения равны");
        }
    }

}
