package task2;

public class CellPhone extends Phone implements Callable {

    public CellPhone(String brand, String model, int number, int issueDate) {
        this.brand = brand;
        this.model = model;
        this.number = number;
        this.issueDate = issueDate;
    }


    @Override
    public void call() {
        System.out.println("Вызываю номер");
    }

    @Override
    public void ring() {
        System.out.println("Дзынь-дзынь");
    }

    @Override

    public String toString() {
        return "CellPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", number=" + number +
                ", issueDate=" + issueDate +
                ", contacts=" + contacts +
                '}';
    }
}
