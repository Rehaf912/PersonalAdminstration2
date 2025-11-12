//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee arbeiter1 = new Employee("Klaus", "Herny", 29031980, "männlich", 45, 74, "Herr Klaus ist immer unpünktlich");
        // Employee arbeiter2 = new Employee("Kevin", "Stein", 02102000, "männlich", 25, 88, "Herr Stein ist reich");
        arbeiter1.zeigeAbteilungAn();
        arbeiter1.setNewAbteilung("B45"); //änderung der Abteilung
        arbeiter1.zeigeAbteilungAn();
        arbeiter1.setNewAbteilung("C64");
        arbeiter1.zeigeAbteilungAn();

    }
}