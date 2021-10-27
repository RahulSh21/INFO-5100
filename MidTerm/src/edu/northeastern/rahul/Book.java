package edu.northeastern.rahul;

public abstract class Book {
    private String title;

    public Book() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String publishYear;
    private double price;

    public Book(String title, double price, String publishYear) {
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }
    public abstract String description();
}
