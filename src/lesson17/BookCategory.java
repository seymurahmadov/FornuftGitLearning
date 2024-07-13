package lesson17;

// BookCategory.java
public enum BookCategory {
    FICTION("Fictional stories"),
    NON_FICTION("Based on real events"),
    SCIENCE("Scientific topics"),
    HISTORY("Historical events"),
    FANTASY("Fantastical elements and worlds");

    private String description;

    BookCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

// Book.java
 class Book {
    private String title;
    private String author;
    private BookCategory category;
    private double price;

    public Book(String title, String author, BookCategory category, double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public BookCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author +
                ", Category: " + category + ", Price: " + price;
    }
}

// BookStore.java
 class BookStore {
    private Book[] books;
    private int count;

    public BookStore(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("BookStore is full! Cannot add more books.");
        }
    }

    public void listBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchByCategory(BookCategory category) {
        for (int i = 0; i < count; i++) {
            if (books[i].getCategory() == category) {
                System.out.println(books[i]);
            }
        }
    }
}

// BookStoreApp.java
 class BookStoreApp {
    public static void main(String[] args) {
        BookStore store = new BookStore(10);

        store.addBook(new Book("The Hobbit", "J.R.R. Tolkien", BookCategory.FANTASY, 10.99));
        store.addBook(new Book("A Brief History of Time", "Stephen Hawking", BookCategory.SCIENCE, 15.99));
        store.addBook(new Book("1984", "George Orwell", BookCategory.FICTION, 8.99));

        System.out.println("Listing all books:");
        store.listBooks();

        System.out.println("\nSearching for books in the SCIENCE category:");
        store.searchByCategory(BookCategory.SCIENCE);
    }
}
