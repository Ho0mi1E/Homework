package lesson4.task5;

import lesson4.task5.Notifier;

public class SMSNotifier extends Notifier {
    public void notifyid(Person person) {
        System.out.println("Вам, " + person.getName() + " пришло сообщение на ваш телефон " + person.getPhone());
    }
}
