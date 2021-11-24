package lesson5.task2;

public class EmployeeActionController implements ActionController {
    private Store store;

    public EmployeeActionController(Store store) {
        this.store = store;
    }
    @Override
    public String getUserInformationByEmail(String email) {
        User check = store.getUser(email);
        String a = "Такого парня нет";
        if (check.getRole() == Role.EMPLOYEE && check != null) {
            a = check.toString();

        }
        if (check.getRole() != Role.EMPLOYEE){
            a ="Недостаточно прав";
        }
        return a;
    }

    @Override
    public void changeSalaryByEmail(String email, int salary) {
        System.out.println("Недостаточно прав");
    }
}


