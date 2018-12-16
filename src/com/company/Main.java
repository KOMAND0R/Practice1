package com.company;

public class Main
{
    public static void main(String[] args)
    {
	     Book book1 = new Book("Эрих Мария Ремарк", "Три товарища", "Серая", 1936, false);
	     Book book2 = new Book("Чак Паланик", "Бойцовский клуб", "Чёрная", 1996, false);

	     book1.printInformation();
	     book2.printInformation();
    }
}
