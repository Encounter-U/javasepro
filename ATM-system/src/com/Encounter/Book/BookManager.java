package com.Encounter.Book;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Encounter
 * @date 2024/6/16 21:32
 */
public class BookManager
    {
        private ArrayList<Book> books;
        private Scanner sc = new Scanner(System.in);

        public BookManager(ArrayList<Book> books)
            {
                this.books = books;
            }

        public void show()
            {
                for (int i = 0; i < books.size(); i++)
                    {
                        Book book = books.get(i);
                        System.out.println("===================");
                        System.out.println("书名：《" + book.getBookName() + "》");
                        System.out.println("价格：" + book.getPrice());
                        System.out.println("作者：" + book.getAuthor());
                    }
            }

        public void delete()
            {
                System.out.print("请输入要移除的书名：");
                String book = sc.next();
                for (int i = 0; i < books.size(); i++)
                    {
                        String bookName = books.get(i).getBookName();
                        if (book.equals(bookName))
                            {
                                books.remove(books.get(i));
                                return;
                            }
                    }
            }
    }
