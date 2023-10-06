package seminar3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {


    // Тут можно хранить аутентифицированных пользователей
    public List<User> data = new ArrayList<>();

//    Добавление пользователя в список если он прошел аудентификацию.

    public void addUser(User user) throws Exception {
        if (user.authenticate(user.name, user.password)) {
            this.data.add(user);
        } else throw new Exception("Неверный логин либо пароль");
    }

    // находится ли пользователь в списке пользователей
    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void userLogout(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            if (!users.get(i).isAdmin) {
                users.remove(i);
            }

        }
    }

}

