package com.xworkz.scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class ScopeRunner {
    public static void main(String[] args) {
        System.out.println("The main method started");
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(CoreConfigure.class);
        ForumMall forumMall=applicationContext.getBean(ForumMall.class);
        System.out.println("Getting the name from forum mall");
        forumMall.setMallID(1);
        forumMall.setMallLocation("Bengaluru");
        forumMall.setMallName("ForumMall");
        System.out.println(forumMall);

        System.out.println("Getting the Terminal class reference by the help of associted class");
        LifeStyle lifeStyle=forumMall.getLifeStyle();
        lifeStyle.setShopId(100);
        lifeStyle.setMallType("Cloth");
        lifeStyle.setShopName("LifeStyle");
        System.out.println("Setting the Terminal details using the associated class");
        System.out.println(lifeStyle);
        System.out.println(forumMall);
        System.out.println("-------------------------------------");
        System.out.println("The details of the library");
        Library library=applicationContext.getBean(Library.class);
        library.setLibraryID(1);
        library.setLibraryName("Ram Library");
        library.setLibraryLocation("Bengaluru");

        System.out.println("The book details");
        Book book= library.getBook();
        book.setBookId(1);
        book.setBookName("Kaya");
        book.setBookPrice(123);
        System.out.println(library);
        System.out.println(book);
        System.out.println("The main method ended");
    }
}
