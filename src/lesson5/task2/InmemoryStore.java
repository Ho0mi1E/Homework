package lesson5.task2;

import lesson4.task6.Person;

import static lesson5.task2.Role.*;

public class InmemoryStore implements Store {
    User[] allUsers;

    InmemoryStore() {
        allUsers = new User[4];
        allUsers[0] = user1;
        allUsers[1] = user2;
        allUsers[2] = user3;
        allUsers[3] = user4;

    }


    @Override
    public User getUser(String email) {
        User check = null;
        for (int i = 0; i < allUsers.length; i++) {
            if (allUsers[i].getEmail().equals(email)){
                check = allUsers[i];

            }

        }
        return check;
    }




    User user1 = new User("Босс", "Молокосос", "TheBossBaby@boss.com", Role.DIRECTOR, 100000);
    User user2 = new User("Мачо", "Мэн", "Macho@men.com", EMPLOYEE, 1000  );
    User user3 = new User("Карлик", "Нос", "KindPerson@boy.com", HR, 10002  );
    User user4 = new User("Ягами", "Лайт", "Death@note.com", EMPLOYEE, 1001  );









}
