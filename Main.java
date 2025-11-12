public class Main {
    public static void main(String[] args) {
        Employee arbeiter1 = new Employee("Klaus", "Herny", 29031980, "männlich", 45, 74, "Herr Klaus ist immer unpünktlich");
        // Employee arbeiter2 = new Employee("Kevin", "Stein", 02102000, "männlich", 25, 88, "Herr Stein ist reich");
        arbeiter1.zeigeAbteilungAn();
        arbeiter1.setNewAbteilung("B45"); //änderung der Abteilung
        arbeiter1.zeigeAbteilungAn();
        arbeiter1.setNewAbteilung("C64");
        arbeiter1.zeigeAbteilungAn();

        Employee e1 = new Employee("Klaus1", "Henry", 29031980, "männlich", 45, 74, "Herr Klaus ist immer unpünktlich");
        Employee e2 = new Employee("Klaus2", "Henry", 29031980, "männlich", 45, 74, "Herr Klaus ist immer unpünktlich");
        Employee e3 = new Employee("Klaus3", "Henry", 29031980, "männlich", 45, 74, "Herr Klaus ist immer unpünktlich");
        Employee e4 = e1;

        e1.setNewAbteilung("C64");
        e2.setNewAbteilung("C64");

        System.out.print("e1: "); e1.zeigeAbteilungAn();
        System.out.print("e2: "); e2.zeigeAbteilungAn();
        System.out.print("e3: "); e3.zeigeAbteilungAn();
        System.out.print("e4: "); e4.zeigeAbteilungAn();
    }
}
