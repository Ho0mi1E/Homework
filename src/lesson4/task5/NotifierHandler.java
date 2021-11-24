package lesson4.task5;

import lesson5.task2.Store;

public class NotifierHandler {
    private Notifier[] notifiers;

    public NotifierHandler(){
        notifiers = new Notifier[] {new EmailNotifier(), new MessangerNotifier(), new SMSNotifier()};
         }
    public void NotifierAll (Person[] person){
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < notifiers.length; j++) {
                notifiers[j].notifyid(person[i]);

            }

        }

    }
    }

    

