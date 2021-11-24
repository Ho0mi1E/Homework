package OOP.task1.sound;

import OOP.task1.sound.SoundProducer;

public abstract class HeadPhones implements SoundProducer {
    @Override
    public void produceSound() {
        System.out.println("Я роняю запад ууууууу");
    }
}
