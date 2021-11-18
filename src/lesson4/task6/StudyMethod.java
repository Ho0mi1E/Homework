package lesson4.task6;

public class StudyMethod {

    private Person[] group;

    public StudyMethod(Person[] group) {
        this.group = group;
    }

    public void pickOne(int i){
        if (i < 0 || i >= group.length ){
            System.out.println("Вы ввели что-то не то, у нас таких нет ");
        }else {
            System.out.println("Вы выбрали " + group[i].getFirstName() + " " + group[i].getLastName());

        }

    }



    public void oldMan() {
        Person sample = group[0];
        for (int i = 0; i < group.length; i++) {
            if (group[i].getAge() > sample.getAge() ){
                sample = group[i];
            }
        }
        System.out.println("Самый старый из группы " + sample.getFirstName() + " " + sample.getLastName());
    }


    public void onlyStudent(){
        int count = 1;
        for (int i = 0; i < group.length; i++) {
            if (group[i] instanceof Student){
                System.out.println("Вот студент номер " + count + " : " + group[i].getFirstName() + " " + group[i].getLastName() );
                count++;
            }

        }
    }

    public void oldFart(){
        Lector father = new Lector("Bob", "Bob", 100, -1);
        int year = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] instanceof Lector){
                Lector lector = (Lector) group[i];
                if (lector.getWorkingYears() > year){
                    year = lector.getWorkingYears();
                    father = lector;
                }

            }

        }
        System.out.println("Вот наш ветеран " + father.getFirstName() + " " + father.getLastName() );

    }
}
