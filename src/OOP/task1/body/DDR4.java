package OOP.task1.body;

public class DDR4 implements RAW{
    public void saveInformation() {
        System.out.println("Сохранил за 0.00001 с");
    }

    @Override
    public void getInformation() {
        System.out.println("Выгрузил за 0.00001 с");

    }
}
