package lab2;

public class Book {

    private int year, page;
    private String author, title, color;


    public Book(){
        year = 1948;
        page = 328;
        author = "George Orwell";
        title = "1984";
        color = "Yellow";
    }

    public Book(int y, String a, String t){
        year = y;
        author = a;
        title = t;
    }

    public Book(int y, int p, String a, String t, String c){
        year = y;
        page = p;
        author = a;
        title = t;
        color = c;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setPage(int page){
        this.page = page;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return year;
    }

    public int getPage(){
        return page;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getColor(){
        return color;
    }
}
