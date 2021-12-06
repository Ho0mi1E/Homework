package OOPtask.task2;

public class Book implements Comparable<Book> {
    private String name;
    private String authorName;
    private int editionYear;

    public Book(String name, String authorName, int editionYear) {
        this.name = name;
        this.authorName = authorName;
        this.editionYear = editionYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getEditionYear() {
        return editionYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", editionYear=" + editionYear +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
}
