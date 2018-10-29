package practice1;

public class Book {

    private double page;
    private String color;
    private String subject;

    public Book(){
        page = 10;
        color = "Red";
        subject = "Fantasy";
    }

    public Book(double p){
        page = p;
        color = "Blue";
    }

    public Book(double p, String c, String s){
        page = p;
        color = c;
        subject = s;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public void setPage(double page){
        this.page = page;
    }

    public double getPage(){
        return page;
    }

    public String getColor(){
        return color;
    }

    public String getSubject(){
        return subject;
    }
}