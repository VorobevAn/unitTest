package Seminar3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar3.tdd.User;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    public static User actualUser;
    public static User AdminUser;

    @BeforeEach
    public void setap(){
        actualUser = new User("Devid","123",true);
        actualUser = new User("Vadim","432",false);
    }

    // Аудентификация пользователя
    @Test
    void authenticate() {

        assertTrue(actualUser.authenticate("Devid","123")); // ожидается true при успешной аудентификации
    }
}