package ru.itsjava.collections.lists.homeWork;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Books {
    private String bookTitle;
    private String author;
    private int pageCount;


    public String toString() {
        return  "Books{" + "''" + this.getBookTitle() + "''" + ", " + "''" + this.getAuthor() + "''" + ", " + this.getPageCount() + "};"+"\n";
    }
}
