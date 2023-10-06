package Seminar3.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminar3.tdd.User;
import seminar3.tdd.UserRepository;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
   protected User actualUser;
   protected User adminUser;
   protected UserRepository userRepository;


    @BeforeEach
    public void setap() throws Exception {
        actualUser = new User("Devid","123",false);
        adminUser = new User("Vadim","432",true);
        userRepository = new UserRepository();
        userRepository.addUser(actualUser);
        userRepository.addUser(adminUser);
    }

// Добавился ли пользователь в список
    @Test
    void addUser()  {
        int ListSize = 2;  // Ожидается что всписке две записи
        assertEquals(ListSize, userRepository.data.size());

    }
// Проверка находится ли пользователь с таким именем в списке
    @Test
    void findByName() throws Exception {
        assertTrue(userRepository.findByName("Devid"));

    }
// Удаление пользователей без статуса администратора
    @Test
    void userLogout() {
        userRepository.userLogout(userRepository.data);
        assertEquals(1, userRepository.data.size()); // в списке должна остаться одна запись
        assertTrue(userRepository.findByName("Vadim")); // в списке остался только пользователь имеющий статус админ

    }
}