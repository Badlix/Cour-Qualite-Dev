package TD1;

import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private String editor;
    private String pageNb;

    public Book(String title, String author, String editor, String pageNb) {
        this.title = title;
        this.author = author;
        this.editor = editor;
        this.pageNb = pageNb;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPageNb() {
        return pageNb;
    }

    public void setPageNb(String pageNb) {
        this.pageNb = pageNb;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                ", pageNb='" + pageNb + '\'' +
                '}';
    }

    public boolean equals(Book book) {
        if (book == this) return true;
        if (book.getAuthor() == this.getAuthor() && book.getEditor() == this.getEditor()) {
            if (book.getTitle() == this.getTitle() && book.getPageNb() == this.getTitle()) {
                return true;
            }
        }
        return false;
    }

}
