package com.mycompany.taller1.biblioteca.git;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Client> clientes = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Loan> loans = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option;
        do {
            System.out.println("\n===== LIBRARY SYSTEM =====");
            System.out.println("1. Client menu");
            System.out.println("2. Book menu");
            System.out.println("3. Loan menu");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> clientMenu();
                case 2 -> bookMenu();
                case 3 -> loanMenu();
                case 0 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    // ======================================================
    // CLIENT MENU
    // ======================================================
    public static void clientMenu() {
        int option;
        do {
            System.out.println("\n-- Client Menu --");
            System.out.println("1. Create client");
            System.out.println("2. List clients");
            System.out.println("3. Search client");
            System.out.println("4. Update client");
            System.out.println("5. Delete client");
            System.out.println("0. Back");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> createClient();
                case 2 -> listClients();
                case 3 -> searchClient();
                case 4 -> updateClient();
                case 5 -> deleteClient();
                case 0 -> System.out.println("Returning...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    public static void createClient() {
        System.out.println("\n-- Create Client --");
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();
        Client client = new Client(id, name, phone, email);
        clientes.add(client);
        System.out.println("Client created successfully.");
    }

    public static void listClients() {
        System.out.println("\n-- Client List --");
        if (clientes.isEmpty()) {
            System.out.println("No registered clients.");
            return;
        }
        for (Client c : clientes) {
            System.out.println(c);
        }
    }

    public static Client findClientById(String id) {
        for (Client c : clientes) {
            if (c.getId().equalsIgnoreCase(id)) {
                return c;
            }
        }
        return null;
    }

    public static void searchClient() {
        System.out.print("Enter ID to search: ");
        String id = sc.nextLine();
        Client c = findClientById(id);
        if (c != null) {
            System.out.println("Client found: " + c);
        } else {
            System.out.println("Client not found.");
        }
    }

    public static void updateClient() {
        System.out.print("Enter ID of client to update: ");
        String id = sc.nextLine();
        Client c = findClientById(id);
        if (c == null) {
            System.out.println("Client not found.");
            return;
        }
        System.out.print("Enter new Name (leave blank to keep current): ");
        String name = sc.nextLine();
        if (!name.isBlank()) c.setName(name);

        System.out.print("Enter new Phone (leave blank to keep current): ");
        String phone = sc.nextLine();
        if (!phone.isBlank()) c.setPhone(phone);

        System.out.print("Enter new Email (leave blank to keep current): ");
        String email = sc.nextLine();
        if (!email.isBlank()) c.setEmail(email);

        System.out.println("Client updated successfully.");
    }

    public static void deleteClient() {
        System.out.print("Enter ID of client to delete: ");
        String id = sc.nextLine();
        Client c = findClientById(id);
        if (c == null) {
            System.out.println("Client not found.");
            return;
        }
        clientes.remove(c);
        System.out.println("Client deleted successfully.");
    }

    // ======================================================
    // BOOK MENU
    // ======================================================
    public static void bookMenu() {
        int option;
        do {
            System.out.println("\n-- Book Menu --");
            System.out.println("1. Create book");
            System.out.println("2. List books");
            System.out.println("3. Search book");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("0. Back");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> createBook();
                case 2 -> listBooks();
                case 3 -> searchBook();
                case 4 -> updateBook();
                case 5 -> deleteBook();
                case 0 -> System.out.println("Returning...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    public static void createBook() {
        System.out.println("\n-- Create Book --");
        System.out.print("Enter Code: ");
        String code = sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Publication Year: ");
        String year = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        Book book = new Book(code, title, year, author, true);
        books.add(book);
        System.out.println("Book created successfully.");
    }

    public static void listBooks() {
        System.out.println("\n-- Book List --");
        if (books.isEmpty()) {
            System.out.println("No registered books.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public static Book findBookByCode(String code) {
        for (Book b : books) {
            if (b.getCode().equalsIgnoreCase(code)) {
                return b;
            }
        }
        return null;
    }

    public static void searchBook() {
        System.out.print("Enter Code to search: ");
        String code = sc.nextLine();
        Book b = findBookByCode(code);
        if (b != null) {
            System.out.println("Book found: " + b);
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void updateBook() {
        System.out.print("Enter Code of book to update: ");
        String code = sc.nextLine();
        Book b = findBookByCode(code);
        if (b == null) {
            System.out.println("Book not found.");
            return;
        }
        System.out.print("Enter new Title (leave blank to keep current): ");
        String title = sc.nextLine();
        if (!title.isBlank()) b.setTitle(title);

        System.out.print("Enter new Author (leave blank to keep current): ");
        String author = sc.nextLine();
        if (!author.isBlank()) b.setAuthor(author);

        System.out.println("Book updated successfully.");
    }

    public static void deleteBook() {
        System.out.print("Enter Code of book to delete: ");
        String code = sc.nextLine();
        Book b = findBookByCode(code);
        if (b == null) {
            System.out.println("Book not found.");
            return;
        }
        books.remove(b);
        System.out.println("Book deleted successfully.");
    }

    // ======================================================
    // LOAN MENU
    // ======================================================
    public static void loanMenu() {
        int option;
        do {
            System.out.println("\n-- Loan Menu --");
            System.out.println("1. Create loan");
            System.out.println("2. List loans");
            System.out.println("3. Return book (close loan)");
            System.out.println("4. Delete loan");
            System.out.println("0. Back");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 1 -> createLoan();
                case 2 -> listLoans();
                case 3 -> returnBook();
                case 4 -> deleteLoan();
                case 0 -> System.out.println("Returning...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    public static void createLoan() {
        System.out.println("\n-- Create Loan --");
        System.out.print("Enter Client ID: ");
        String clientId = sc.nextLine();
        Client client = findClientById(clientId);
        if (client == null) {
            System.out.println("Client not found.");
            return;
        }

        System.out.print("Enter Book Code: ");
        String bookCode = sc.nextLine();
        Book book = findBookByCode(bookCode);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (!book.isAvailable()) {
            System.out.println("Book is not available.");
            return;
        }

        System.out.print("Enter Loan ID: ");
        String loanId = sc.nextLine();

        Loan loan = new Loan(loanId, client, book, LocalDate.now(), "ACTIVE");
        loans.add(loan);
        book.setAvailable(false);
        System.out.println("Loan created successfully.");
    }

    public static void listLoans() {
        System.out.println("\n-- Loan List --");
        if (loans.isEmpty()) {
            System.out.println("No registered loans.");
            return;
        }
        for (Loan l : loans) {
            System.out.println(l);
        }
    }

    public static Loan findLoanById(String loanId) {
        for (Loan l : loans) {
            if (l.getLoanId().equalsIgnoreCase(loanId)) {
                return l;
            }
        }
        return null;
    }

    public static void returnBook() {
        System.out.print("Enter Loan ID to close: ");
        String loanId = sc.nextLine();
        Loan l = findLoanById(loanId);
        if (l == null) {
            System.out.println("Loan not found.");
            return;
        }
        l.setStatus("RETURNED");
        l.getBook().setAvailable(true);
        System.out.println("Book returned successfully.");
    }

    public static void deleteLoan() {
        System.out.print("Enter Loan ID to delete: ");
        String loanId = sc.nextLine();
        Loan l = findLoanById(loanId);
        if (l == null) {
            System.out.println("Loan not found.");
            return;
        }
        loans.remove(l);
        System.out.println("Loan deleted successfully.");
    }
}
