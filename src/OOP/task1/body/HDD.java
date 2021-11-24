package OOP.task1.body;

public abstract class HDD implements Memory{
    @Override
    public void saveInformation() {
        System.out.println("Загружаю");
        for (int i = 0; i < 15; i++) {
            System.out.println("...");

        }
        System.out.println("Загрузил");
    }

    @Override
    public void getInformation() {
        System.out.println("Выгружаю");
        for (int i = 0; i < 15; i++) {
            System.out.println("...");

        }
        System.out.println("Выгрузил");

    }
}
