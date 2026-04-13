// Demonstrates Dependency Inversion Principle and SOLID-friendly library borrowing.

interface LibraryResource {
    String getTitle();
    void borrow(String borrowerName);
}

class Book implements LibraryResource {
    private final String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String borrowerName) {
        System.out.println(borrowerName + " borrowed the book: " + title);
    }
}

class Journal implements LibraryResource {
    private final String title;

    Journal(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String borrowerName) {
        System.out.println(borrowerName + " borrowed the journal: " + title);
    }
}

class Newspaper implements LibraryResource {
    private final String title;

    Newspaper(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String borrowerName) {
        System.out.println(borrowerName + " borrowed the newspaper: " + title);
    }
}

class Thesis implements LibraryResource {
    private final String title;

    Thesis(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String borrowerName) {
        System.out.println(borrowerName + " borrowed the thesis: " + title);
    }
}

class Capstone implements LibraryResource {
    private final String title;

    Capstone(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String borrowerName) {
        System.out.println(borrowerName + " borrowed the capstone project: " + title);
    }
}

class InternetAccess implements LibraryResource {
    private final String title;

    InternetAccess(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String borrowerName) {
        System.out.println(borrowerName + " requested internet access: " + title);
    }
}

// Future resource type can be added without changing Student.
class AudioBook implements LibraryResource {
    private final String title;

    AudioBook(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(String borrowerName) {
        System.out.println(borrowerName + " borrowed the audiobook: " + title);
    }
}

class Student {
    private final String name;

    Student(String name) {
        this.name = name;
    }

    public void borrowResource(LibraryResource resource) {
        System.out.println(name + " is borrowing resource: " + resource.getTitle());
        resource.borrow(name);
    }
}

public class LibraryExample {
    public static void main(String[] args) {
        Student alice = new Student("Alice");

        LibraryResource book = new Book("Design Patterns in Java" + "\n");
        LibraryResource journal = new Journal("Journal of Software Engineering" + "\n");
        LibraryResource thesis = new Thesis("SOLID Architecture in Practice" + "\n");
        LibraryResource capstone = new Capstone("Campus App for Library Services" + "\n");
        LibraryResource newspaper = new Newspaper("Campus Daily News" + "\n");
        LibraryResource internet = new InternetAccess("NEU Wi-Fi Session" + "\n");
        LibraryResource audioBook = new AudioBook("Clean Code Audio Edition" + "\n");

        alice.borrowResource(book);
        alice.borrowResource(journal);
        alice.borrowResource(thesis);
        alice.borrowResource(capstone);
        alice.borrowResource(newspaper);
        alice.borrowResource(internet);
        alice.borrowResource(audioBook);
    }
}
