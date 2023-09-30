package Seminar2Test;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import seminar2.Car;
import seminar2.Motorcycle;
import seminar2.Vehicle;

import static org.junit.jupiter.api.Assertions.*;
// Написать следующие тесты:
//             - проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
//             - проверка того, объект Car создается с 4-мя колесами
//             - проверка того, объект Motorcycle создается с 2-мя колесами
//             - проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
//             - проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
//             - проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)
//             - проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0

public class VehicleTest {
    private Car car;
    private Motorcycle motorcycle;


    @BeforeEach
    public void setap() {
        car = new Car("Audi", "A6", 2);
        motorcycle = new Motorcycle("BMV", "R7", 3);
    }

    // проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void carBelongsVehicle() {
        assertInstanceOf(Vehicle.class, car);
    }

    //    Проверка для класса мотоциклы
    @Test
    public void MotoBelongsVehicle() {
        assertInstanceOf(Vehicle.class, motorcycle);
    }

    //     проверка того, объект Car создается с 4-мя колесами
    @Test
    public void carCountWheels() {
        int countWheels = 4;
        int currentNumberWheels = car.getNumWheels();
        assertEquals(countWheels, currentNumberWheels, "Метод устанавливает неверное колличество колес");
    }
//    проверка того, объект Motorcycle создается с 2-мя колесами

    @Test
    public void motoCountWheels() {
        int countWheels = 2;
        int currentNumberWheels = motorcycle.getNumWheels();
        assertEquals(countWheels, currentNumberWheels, "Метод устанавливает неверное колличество колес");
    }

    //     проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void carspeed() {
        int expectedSpeed = 60;
        car.testDrive();
        int actual = car.getSpeed();
        assertEquals(expectedSpeed, actual, "Скорорость в режиме вождения не верна");
    }

    // проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void motoSpeed() {
        int expectedSpeed = 75;
        motorcycle.testDrive();
        int actual = motorcycle.getSpeed();
        assertEquals(expectedSpeed, actual, "Скорорость в режиме вождения не верна");
    }
//    проверить, что в режиме парковки (сначала testDrive, потом park, т.е эмуляция движения транспорта) машина останавливается (speed = 0)

    @Test
    public void carParkTest() {
        int expectedSpeed = 60;
        car.testDrive();
        int actual = car.getSpeed();
        assertEquals(expectedSpeed, actual, "Скорорость в режиме вождения автомобимя не верна");
        expectedSpeed = 0;
        car.park();
        actual = car.getSpeed();
        assertEquals(expectedSpeed, actual, "Скорорость в режиме парковки не верна");
    }

    //    проверить, что в режиме парковки (сначала testDrive, потом park  т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public void motoParkTest() {
        int expectedSpeed = 75;
        motorcycle.testDrive();
        int actual = motorcycle.getSpeed();
        assertEquals(expectedSpeed, actual, "Скорорость в режиме вождения не верна");
        expectedSpeed = 0;
        motorcycle.park();
        actual = motorcycle.getSpeed();
        assertEquals(expectedSpeed, actual, "Скорорость в режиме парковки не верна");
    }
}
