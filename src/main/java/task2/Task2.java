package task2;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        CellPhone nokia = new CellPhone("Nokia", "c31E", 637856324, 2015);
        SmartPhone honor = new SmartPhone("Honor", "h176 Smart", 633456324, 2019, 5.3);
        Phone lenovo;
        boolean isequal = nokia.equals(honor);
//        nokia.setContacts(new int[] {735671298, 978657254, 935648971});
//        System.out.println(contacts1);
        nokia.addContact("Vasya", 675234554);
        nokia.addContact("Petya", 631670187);
        nokia.addContact("Vera", 675454554);
        nokia.addContact("Liza", 675672333);

        System.out.println(nokia.findContactInfo("Petya"));
        System.out.println(nokia.findContactInfo("Sereja"));
        System.out.println(nokia.getContactNumber("Vera"));

    }

}
