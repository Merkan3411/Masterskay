package com.example.master;

import java.util.ArrayList;
import java.util.List;

public class ClientService {
    private final List<Client> clients;

    public ClientService() {
        clients = new ArrayList<>();
        clients.add(new Client("Иван", "Иванов", "Иванович", "89101234567"));
        clients.add(new Client("Мария", "Петрова", "Сергеевна", ""));
        clients.add(new Client("Алексей", "Сидоров", "Павлович", "89105557788"));
    }

    public Client findByFirstName(String firstName) {
        if (firstName == null) return null;
        for (Client client : clients) {
            if (client.getFirstName() != null &&
                    client.getFirstName().equalsIgnoreCase(firstName)) {
                return client;
            }
        }
        return null;
    }

    public List<Client> getAllClients() {
        return clients;
    }
}