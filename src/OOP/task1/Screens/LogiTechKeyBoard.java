package OOP.task1.Screens;

import OOP.task1.devaces.Keyboard;

public class LogiTechKeyBoard implements Keyboard {
    @Override
    public void typeText() {
        System.out.println("Печатаю");
    }
}
