package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Book> books;

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> findBooksByYear(int year) {
        return books.stream()
                .filter(book -> book.getPublicationYear() == year)
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public Book findBookWithMostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);
    }

    public List<Book> findBooksByPageCount(int pageCount) {
        return books.stream()
                .filter(book -> book.getPages() > pageCount)
                .collect(Collectors.toList());
    }

    public void printAllBookTitlesSorted() {
        List<String> sortedTitles = books.stream()
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());

        sortedTitles.forEach(System.out::println);
    }

    public List<Book> findBooksByCategory(String category) {
        return books.stream()
                .filter(book -> book.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public void loanBook(User user, Book book) {
        if(!book.isOnLoan()){
            book.setIsOnLoan(true);
            user.getLoanedBooks().add(book);
        }
    }

    public void returnBook(User user, Book book) {
        if(user.getLoanedBooks().contains(book)){
            book.setIsOnLoan(false);
            user.getLoanedBooks().remove(book);
        }
    }
}
