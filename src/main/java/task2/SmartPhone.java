package task2;

public class SmartPhone extends Phone implements Callable{

    private double diagonal;

    public SmartPhone(String brand, String model, int number, int issueDate, double diagonal) {
        this.brand = brand;
        this.model = model;
        this.number = number;
        this.issueDate = issueDate;
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    @Override
    public void call() {
//        openConnection();
        System.out.println("Siri вызывает номер");
    }

    @Override
    public void ring() {

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", number=" + number +
                ", issueDate=" + issueDate +
                ", contacts=" + contacts +
                ", diagonal=" + diagonal +
                '}';
    }

}
