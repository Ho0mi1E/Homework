package OOP.task1.body;

public abstract class SSD implements Memory{


    @Override
    public void saveInformation() {
        System.out.println("Загружаю");
        System.out.println("Загружаю");
        System.out.println("Загрузил");

    }

    @Override
    public void getInformation() {
        System.out.println("Выгружаю");
        System.out.println("Выгружаю");
        System.out.println("Выгрузил");

    }
}
