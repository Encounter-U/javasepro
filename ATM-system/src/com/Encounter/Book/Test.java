package com.Encounter.Book;

import java.util.ArrayList;

/**
 * @author Encounter
 * @date 2024/6/16 21:39
 */

/**
 * 小谷在书架上的这些书除了书名之外还有其他的信息:比如书的价格和书的作者。现在我们需要把这些信息封装成一个Book类。并创建一个集合
 * 来依次存放这些数据。
 * 书名:
 * 《Java编程思想》、价格:76.9元、作者:布鲁斯·埃克尔
 * 书名:
 * 《Java核心技术卷》、价格:104.7元、作者:霍斯特曼
 * 书名:
 * 《Java性能优化》、价格:94.8元、作者:查理,亨特
 * 书名:《Java并发编程之美》、价格:44.5元、作者:翟陆续
 * 小谷暂时不想看《Java并发编程之美》这本书将这本书暂时移除了书架。请使用集合完成上面的操作，并且将书架上剩余的书打印到控制台上。
 */
public class Test
    {
        public static void main(String[] args)
            {
                ArrayList<Book> books = new ArrayList<>();
                books.add(new Book("Java编程思想", 76.9, "布鲁斯·埃克尔"));
                books.add(new Book("Java核心技术卷", 104.7, "霍斯特曼"));
                books.add(new Book("Java性能优化", 94.8, "查理·亨特"));
                books.add(new Book("Java并发编程之美", 44.5, "翟陆续"));
                //展示书架
                BookManager bm = new BookManager(books);
                bm.show();
                //移除书架
                bm.delete();
                bm.show();
            }
    }