package Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 180, "Fiction", false);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 281, "Fiction", false);
        Book book3 = new Book("1984", "George Orwell", 1949, 328, "Science Fiction", false);

        // Create a list of loaned books
        List<Book> loanedBooks = new ArrayList<>();
        loanedBooks.add(book1);
        loanedBooks.add(book2);

        // Create a user
        User user = new User("John Doe", 12345, loanedBooks);

        // Print user details
        System.out.println("User Name: " + user.getName());
        System.out.println("Library Card Number: " + user.getLibraryCardNumber());
        System.out.println("Loaned Books:");

        // Print loaned books
        List<Book> userLoanedBooks = user.getLoanedBooks();
        for (Book book : userLoanedBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publication Year: " + book.getPublicationYear());
            System.out.println("Pages: " + book.getPages());
            System.out.println("Category: " + book.getCategory());
            System.out.println("Is On Loan: " + book.isOnLoan());
            System.out.println();
        }

        // Set a book on loan
        book1.setIsOnLoan(true);

        // Print updated book details
        System.out.println("Updated Book Details:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Is On Loan: " + book1.isOnLoan());
    }
}

