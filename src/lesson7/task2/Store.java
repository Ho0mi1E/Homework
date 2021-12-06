package lesson7.task2;

public class Store {
    User[] users = new User[4];

    User first = new User("H0m1E", "adasdd");
    User second = new User("H0m1e", "adasdd");
    User third = new User("H0m1f", "adasdd");

    Store(){
        users[0] = first;
        users[1] = second;
        users[2] = third;

    }

    public void getlogin(String login, String password){
        User user = null;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(login) && users[i].getPassword().equals(password)){
                user = users[i];
                System.out.println("Есть такой");
                System.out.println("Вот его логин " + user.getLogin() );
                System.out.println("Вот его пароль " + user.getPassword() );
                System.out.println("Его номер в списке " + (i + 1) );
            }
        }
        try {

            if (user == null) throw new Exception("Нет такого пользователя или неверный пароль");

    } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
    void addUser(User user){
        try{
            for (int i = 0; i < users.length; i++) {
                if (users[i] == null){
                    users[i] = user;

                }

            }
            if (users[users.length - 1] != user && users[users.length - 1] != null) throw new Exception("Нет места");
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Парень принят");


    }

}

