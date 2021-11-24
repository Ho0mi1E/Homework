package lesson5.task2;

public class DirectorActionController implements ActionController{

    private Store store;

    public DirectorActionController(Store store) {
        this.store = store;
    }

    @Override
    public String getUserInformationByEmail(String email) {
        User check = store.getUser(email);
        String a = "Такого парня нет у нас на работе" ;
        if (check != null){
            a =check.toString();
        }
        return a;

    }

    @Override
    public void changeSalaryByEmail(String email, int salary) {
        User check = store.getUser(email);
        if (check != null){
           check.setSalary(salary);
        }else {
            System.out.println("Такого парня нет у нас на работе");

        }
    }


    }

