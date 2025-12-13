package com.xworkz.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Library {
    private int libraryID;
    private String libraryName;
    private String libraryLocation;
    @Autowired
    private Book book;

    public int getLibraryID() {
        return libraryID;
    }

    public Book getBook() {
        return book;
    }

    public String getLibraryLocation() {
        return libraryLocation;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setLibraryID(int libraryID) {
        this.libraryID = libraryID;
    }

    public void setLibraryLocation(String libraryLocation) {
        this.libraryLocation = libraryLocation;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryID=" + libraryID +
                ", libraryName='" + libraryName + '\'' +
                ", libraryLocation='" + libraryLocation + '\'' +
                ", book=" + book +
                '}';
    }
}
