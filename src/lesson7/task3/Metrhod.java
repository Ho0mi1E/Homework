package lesson7.task3;

import java.util.Locale;

public class Metrhod {

    private String string;

    public Metrhod(){

    }

    public void getSeasons(String sesons) throws RuntimeException{
        string = Season.valueOf(string.toUpperCase(Locale.ROOT)).getSeason();

    }

    @Override
    public String toString() {
        return "Metrhod{" +
                "string='" + string + '\'' +
                '}';
    }
}
