package lesson4.task5;

public class MessangerNotifier extends Notifier {
    public void notifyid(Person person) {
        System.out.println("Вам, " + person.getName() + " пришло сообщение в телеграмм " + person.getPhone());

    }
}
