package OOP.task1.body;

public class DDR3 implements RAW{
    @Override
    public void saveInformation() {
        System.out.println("Сохранил за 0.001 с");
    }

    @Override
    public void getInformation() {
        System.out.println("Выгрузил за 0.001 с");

    }
}
