package TD1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Library {
    private final int MAX_BOOKS;
    private String name;
    private String address;
    private ArrayList<Book> books = new ArrayList<>();


    public Library(int maxBooks, String name, String address) {
        this.MAX_BOOKS = maxBooks;
        this.name = name;
        this.address = address;
    }

    public int getMAX_BOOKS() {
        return MAX_BOOKS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMax() {
        return max;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        if (this.books.size() < this.MAX_BOOKS) {
            this.books.add(book);
        }
        System.out.println("The library is already full.");
    }

    public void removeBook(Book book) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).equals(book)) {
                this.books.remove(i);
                return ;
            }
        }
    }

    public void removeDuplicate() {
        int cmp = 0;
        while (cmp < this.books.size()) {
            int cmp2 = cmp+1;
            while (cmp2 < this.books.size()) {
                if (this.books.get(cmp).equals(this.books.get(cmp2))) {
                    this.books.remove(cmp2);
                } else {
                    ++cmp2;
                }
            }
            ++cmp;
        }
    }

    @Override
    public String toString() {
        String text = "Library{" +
                "MAX_BOOKS=" + MAX_BOOKS +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", books : ";
        text += showBooks();
        return text;
    }

    public String showBooks() {
        String text = "\nbooks : ";
        for (Book book : books) {
            text += "\n   - " + book.toString();
        }
        return text;
    }

    public String showBooksInTwoLibrary(Library library) {
        return this.name + this.showBooks() + "\n" + library.name + library.showBooks();
    }

    public void sortByAuthor() {
        ArrayList<String> author = new ArrayList<>();
        for (Book book : this.books) {
            author.add(book.getAuthor());
        }
        Collections.sort(author);
        ArrayList<Book> newBooksList = new ArrayList<>();
        while (author.size() > 0) {
            for (Book book : this.books) {
                if (book.getAuthor() == author.get(0)) {
                    newBooksList.add(book);
                    this.books.remove(book);
                    author.remove(0);
                    break;
                }
            }
        }
        this.books = newBooksList;
    }
}
