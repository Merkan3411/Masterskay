package com.example.master;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void testCreateClientWithAllFields() {
        Client client = new Client("Иван", "Иванов", "Иванович", "89101234567");

        assertEquals("Иван", client.getFirstName());
        assertEquals("Иванов", client.getLastName());
        assertEquals("Иванович", client.getMiddleName());
        assertEquals("89101234567", client.getPhone());
        assertTrue(client.getId() > 0);
    }

    @Test
    void testClientWithEmptyPhone() {
        Client client = new Client("Мария", "Петрова", "Сергеевна", "");

        assertEquals("Мария", client.getFirstName());
        assertEquals("Петрова", client.getLastName());
        assertEquals("Сергеевна", client.getMiddleName());
        assertNull(client.getPhone());
    }

    @Test
    void testSetters() {
        Client client = new Client("А", "Б", "В", "1");

        client.setFirstName("Елена");
        client.setLastName("Смирнова");
        client.setMiddleName("Игоревна");
        client.setPhone("89100001122");

        assertEquals("Елена", client.getFirstName());
        assertEquals("Смирнова", client.getLastName());
        assertEquals("Игоревна", client.getMiddleName());
        assertEquals("89100001122", client.getPhone());
    }
}