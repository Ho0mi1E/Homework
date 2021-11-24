package OOP.task1.sound;

import OOP.task1.sound.SoundProducer;

public abstract class Speaker implements SoundProducer {
    @Override
    public void produceSound() {
        System.out.println("говорите");
    }
}
