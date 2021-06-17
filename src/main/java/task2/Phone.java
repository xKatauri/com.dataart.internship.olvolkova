package task2;

import java.util.HashMap;
import java.util.Objects;

public abstract class Phone {
    String brand;
    String model;
    int number;
    int issueDate;

    HashMap<String, Contact> contacts = new HashMap<>();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getNumber() {
        return number;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public HashMap<String, Contact> getContacts() {
        return contacts;
    }

    public Integer getContactNumber(String name) {
        Contact contact = contacts.get(name);
        if (contact == null) {
            return null;
        }
        return contact.getPhoneNumber();
    }

    // Overload for addContact
    public void addContact(Contact c) {
        contacts.put(c.getName(), c);
    }

    public void addContact(String name, int phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        contacts.put(name, newContact);
    }

    public String findContactInfo(String name) {
        Contact contactInfo = contacts.get(name);
        if (contactInfo != null) {
            return contactInfo.toString();
        } else {
            return "Not found: " + name;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number && issueDate == phone.issueDate && brand.equals(phone.brand) && model.equals(phone.model) && Objects.equals(contacts, phone.contacts);
    }

    public boolean equals(SmartPhone o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return number == phone.number && issueDate == phone.issueDate && brand.equals(phone.brand) && model.equals(phone.model) && Objects.equals(contacts, phone.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, number, issueDate, contacts);
    }
}
