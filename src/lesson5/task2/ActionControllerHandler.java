
package lesson5.task2;

public class ActionControllerHandler  {

    private Store store;

     ActionControllerHandler() {

    store = new InmemoryStore();
     }
    public void getActionController(Role role){
         switch (role){
             case HR -> new HRActionController(store).changeSalaryByEmail("TheBossBaby@boss.com",100);


            }
         }
    }




