package seminar4.book;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {
    // создаем объект типа mock для интерфейса
    @Mock
    BookRepository bookRepTest;

    //создаем экземпляр BookService с заглушкой
    @InjectMocks
    BookService servis = new BookService(bookRepTest);

    @Test
    void myTest() {
        // переопределяем поведение метода
        when(bookRepTest.findById("1")).thenReturn(new Book("1"));

        assertEquals("1", servis.findBookById("1").getId());

        // проверяем что метод отработал с нужными аргументами
        verify(bookRepTest).findById("1");
    }

    @Test
    void findAllBooks() {

        // переопределяем поведение метода
        when(bookRepTest.findAll()).thenReturn(new ArrayList<>(Arrays.asList(new Book("1"), new Book("2"), new Book("3"))));

        // проверяем что вернувшийся размер листа равен заданному.
        assertEquals(3, servis.findAllBooks().size());
    }

}