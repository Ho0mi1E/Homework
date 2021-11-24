package OOP.task2;

public class Factory {
    private Employee boss;
    private Worker[] workers;

    public Factory(Director boss, int i) {
        this.boss = boss;
        this.workers = new Worker[i];
    }

    public void addWorker(Worker worker){
        for (int j = 0; j < workers.length ; j++) {
            if (workers[j] == null){
                workers[j] = worker;
                System.out.println("Рабочий добавлен");
                return;
            }

        }
    }
}
