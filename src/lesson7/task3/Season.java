package lesson7.task3;

public enum Season {
    WINTER("Зима"),
    SUMMER("Лето"),
    AUTUMN("Осень"),
    SPRING("Весна");

    private String season;
    private Season[] seasons;

    Season(String season) {
        seasons = new Season[]{Season.valueOf("Зима"), Season.valueOf("Лето"), Season.valueOf("Осень"), Season.valueOf("Весна")};
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
}
