package com.mycompany.taller1.biblioteca.git;


import com.mycompany.taller1.biblioteca.git.Person;

public class Client extends Person {

    // Own attribute
    private String email;

    // Constructor
    public Client(String id, String name, String phone, String email) {
        super(id, name, phone);
        this.email = email;
    }

    // Getter
    public String getEmail() {
        return email;
    }

    // Setter
    public void setEmail(String email) {
        this.email = email;
    }

    // toString for easy printing/debugging
    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}