package lesson4.task5;

public  class EmailNotifier extends Notifier {
    @Override
    public void notifyid(Person person) {
        System.out.println("Вам, " + person.getName()  +  " пришло сообщение на ваш email " + person.getEmail());

    }
}
