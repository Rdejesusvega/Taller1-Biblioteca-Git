package com.mycompany.taller1.biblioteca.git;

import java.time.LocalDate;

public class Loan {

    // Attributes
    private String loanId;
    private Client client;
    private Book book;
    private LocalDate date;
    private String status;

    // Constructor
    public Loan(String loanId, Client client, Book book, LocalDate date, String status) {
        this.loanId = loanId;
        this.client = client;
        this.book = book;
        this.date = date;
        this.status = status;
    }

    // Getters
    public String getLoanId() {
        return loanId;
    }

    public Client getClient() {
        return client;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // toString for easy printing/debugging
    @Override
    public String toString() {
        return "Loan{" +
                "loanId='" + loanId + '\'' +
                ", client=" + client.getName() +
                ", book=" + book.getTitle() +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
