package com.example.master;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientServiceTest {

    private ClientService service;

    @BeforeEach
    void setUp() {
        service = new ClientService();
    }

    @Test
    void testInitialClientsCount() {
        assertEquals(3, service.getAllClients().size());
    }

    @Test
    void testFindByFirstNameExists() {
        Client client = service.findByFirstName("Иван");
        assertNotNull(client);
        assertEquals("Иван", client.getFirstName());
    }

    @Test
    void testFindByFirstNameIgnoreCase() {
        Client client = service.findByFirstName("иВаН");
        assertNotNull(client);
        assertEquals("Иван", client.getFirstName());
    }

    @Test
    void testFindByFirstNameNotFound() {
        Client client = service.findByFirstName("Николай");
        assertNull(client);
    }

    @Test
    void testFindByFirstNameNull() {
        Client client = service.findByFirstName(null);
        assertNull(client);
    }
}