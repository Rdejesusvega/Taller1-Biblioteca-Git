package com.mycompany.taller1.biblioteca.git;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Client> clientes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Main menu will go here (Phase 8)
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
        System.out.print("Enter the ID of the client to update: ");
        String id = sc.nextLine();
        Client c = findClientById(id);

        if (c != null) {
            System.out.print("New Name: ");
            c.setName(sc.nextLine());

            System.out.print("New Phone: ");
            c.setPhone(sc.nextLine());

            System.out.print("New Email: ");
            c.setEmail(sc.nextLine());

            System.out.println("Client updated successfully.");
        } else {
            System.out.println("Client not found.");
        }
    }
    
    public static void deleteClient() {
        System.out.print("Enter the ID of the client to delete: ");
        String id = sc.nextLine();
        Client c = findClientById(id);

        if (c != null) {
            clientes.remove(c);
            System.out.println("Client deleted successfully.");
        } else {
            System.out.println("Client not found.");
        }
    }
}
