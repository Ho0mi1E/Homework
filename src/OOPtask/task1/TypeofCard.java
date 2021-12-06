package OOPtask.task1;

public enum TypeofCard {
    DEBIT("дебитавая"),
    CREDIT("кредитная");

    private String type;

    TypeofCard(String type) {
        this.type = type;
    }
}
