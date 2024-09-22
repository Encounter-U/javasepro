package com.Encounter.Book;

/**
 * @author Encounter
 * @date 2024/6/16 21:30
 */
public class Book
    {
        private String bookName;
        private double price;
        private String author;

        public Book(String bookName, double price, String author)
            {
                this.bookName = bookName;
                this.price = price;
                this.author = author;
            }

        public Book()
            {
            }

        public String getBookName()
            {
                return bookName;
            }

        public void setBookName(String bookName)
            {
                this.bookName = bookName;
            }

        public double getPrice()
            {
                return price;
            }

        public void setPrice(double price)
            {
                this.price = price;
            }

        public String getAuthor()
            {
                return author;
            }

        public void setAuthor(String author)
            {
                this.author = author;
            }
    }
