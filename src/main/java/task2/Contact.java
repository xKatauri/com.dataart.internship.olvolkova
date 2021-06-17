package task2;

public class Contact {

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    private String name;
    private Integer phoneNumber;

    Contact(String name, Integer phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }
}
