package com.company;

public class Book
{
    private String author;
    private String name;
    private String colour;
    private int year;
    private boolean hasPictures;

    Book(String a, String n, String c, int y, boolean h)
    {
        this.author = a;
        this.name = n;
        this.colour = c;
        this.year = y;
        this.hasPictures = h;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setColour(String colour)
    {
        this.colour = colour;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setHasPictures(boolean hasPictures)
    {
        this.hasPictures = hasPictures;
    }

    public String getAuthor()
    {
        return author;
    }
    public String getName()
    {
        return name;
    }
    public String getColour()
    {
        return colour;
    }
    public int getYear()
    {
        return year;
    }
    public boolean getHasPictures()
    {
        return hasPictures;
    }

    public void printInformation()
    {
        System.out.println("Название: " + this.name);
        System.out.println("Автор: " + this.author);
        System.out.println("Год выпуска: " + this.year);
        System.out.println("Цвет книги: " + this.colour);
        System.out.println("Наличие картинок: " + this.hasPictures + "\n");
    }
}
