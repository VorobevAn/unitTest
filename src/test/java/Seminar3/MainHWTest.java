package Seminar3;

import org.junit.jupiter.api.Test;
import seminar3.hw.MainHW;

import static org.junit.Assert.*;

public class MainHWTest {
    //    проверка метода ( ожидается возвращение true)
    @Test
    public void evenOddNumberTest() {
        int number = 6;
        assertTrue("число не четное",MainHW.evenOddNumber(number)); // проверка что число четное
    }


    @Test
    public void numberCheckTest() {
//    Проверка попадает ли переданное число в интервал от 25 до 100
        assertTrue(MainHW.numberCheck(25));
    }

}
