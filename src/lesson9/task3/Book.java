package lesson9.task3;

public class Book {
    private int id;
    private String name;
    private String authorName;
    private String editionCountry;
    private int editionYear;

    public Book(int id, String name, String authorName, String editionCountry, int editionYear) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.editionCountry = editionCountry;
        this.editionYear = editionYear;
    }

    public Book(String name, String authorName, String editionCountry, int editionYear) {
        this.name = name;
        this.authorName = authorName;
        this.editionCountry = editionCountry;
        this.editionYear = editionYear;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getEditionCountry() {
        return editionCountry;
    }

    public int getEditionYear() {
        return editionYear;
    }
}
