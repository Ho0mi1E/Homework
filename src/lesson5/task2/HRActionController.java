package lesson5.task2;

public class HRActionController implements ActionController{
    private Store store;

    public HRActionController(Store store) {
        this.store = store;
    }

    @Override
    public String getUserInformationByEmail(String email) {
        User check = store.getUser(email);
        String a = "Такого парня нет у нас на работе";
        if (check != null){
            a =check.toString();
        }
            return a;
    }

    @Override
    public void changeSalaryByEmail(String email, int salary) {
        User check = store.getUser(email);
        if (check.getRole() == Role.EMPLOYEE && check != null) {
            check.setSalary(salary);
            return;
        }
        if (check.getRole() != Role.EMPLOYEE){
            System.out.println("Недостаточно прав");
            return;
        }


        System.out.println("Такого парня нет");

    }
}
