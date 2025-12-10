public class Main {
    public static void main(String[] args) {
        Employee arbeiter1 = new Employee("Klaus", "Herny", 29031980, "männlich", 43, 74, "Herr Klaus ist immer unpünktlich");
        Employee arbeiter2 = new Employee("Klaus1", "Herny1", 02102000, "männlich", 50, 88, "reich");
        Employee arbeiter3 = new Employee("Klaus2", "Hern2", 02102001, "männlich", 51, 88, "reich");
        Employee arbeiter4 = new Employee("Klaus3", "Herny3", 02102002, "weiblich", 75, 88, "reich");
        Employee arbeiter5 = new Employee("Klaus4", "Herny4", 02102003, "männlich", 621, 88, "reich");
        Employee arbeiter6 = new Employee("Klaus5", "Herny5", 02102004, "weiblich", 50, 88, "reich");

        System.out.println("Mein Name ist: " + arbeiter1.getName() + " und verdiene " + arbeiter1.getGehalt() + " ich bin " + arbeiter1.getAlter() + " und bin " + arbeiter1.getGeschlecht() + ". ich wiege " + arbeiter1.getGewicht());
        System.out.println("Mein Name ist: " + arbeiter2.getName() + " und verdiene " + arbeiter2.getGehalt() + " ich bin " + arbeiter2.getAlter() + " und bin " + arbeiter2.getGeschlecht() + ". ich wiege " + arbeiter2.getGewicht());
        System.out.println("Mein Name ist: " + arbeiter3.getName() + " und verdiene " + arbeiter3.getGehalt() + " ich bin " + arbeiter3.getAlter() + " und bin " + arbeiter3.getGeschlecht() + ". ich wiege " + arbeiter3.getGewicht());
        System.out.println("Mein Name ist: " + arbeiter4.getName() + " und verdiene " + arbeiter4.getGehalt() + " ich bin " + arbeiter4.getAlter() + " und bin " + arbeiter4.getGeschlecht() + ". ich wiege " + arbeiter4.getGewicht());
        System.out.println("Mein Name ist: " + arbeiter5.getName() + " und verdiene " + arbeiter5.getGehalt() + " ich bin " + arbeiter5.getAlter() + " und bin " + arbeiter5.getGeschlecht() + ". ich wiege " + arbeiter5.getGewicht());
        System.out.println("Mein Name ist: " + arbeiter6.getName() + " und verdiene " + arbeiter6.getGehalt() + " ich bin " + arbeiter6.getAlter() + " und bin " + arbeiter6.getGeschlecht() + ". ich wiege " + arbeiter6.getGewicht());

        if (arbeiter1.getAlter() >= 40) {
            arbeiter1.setGehalt(3000);
        }
        if (arbeiter2.getAlter() >= 50) {
            arbeiter2.setGehalt((int)Math.random() * 1000 + 4000);

        }
        if (arbeiter3.getGeschlecht() == "weiblich") {
            arbeiter3.setGehalt(arbeiter3.getGehalt() + 10000);
        } else {
            arbeiter3.setGehalt(arbeiter3.getGehalt() - 5000);
        }
        if (arbeiter5.getGeschlecht() == "männlich") {
            arbeiter5.setGewicht(arbeiter5.getGewicht() - 10);
        }
        if (arbeiter4.getGeschlecht() == "weiblich" && arbeiter4.getAlter() >= 50 && arbeiter4.getAlter() <= 65) {
            arbeiter4.setGewicht(arbeiter4.getGewicht() - 5);
        } else {
            arbeiter4.setGewicht(arbeiter4.getGewicht() + 2);
        }

        System.out.println("\r\nMein Name ist: " + arbeiter1.getName() + " und verdiene " + arbeiter1.getGehalt() + " ich bin " + arbeiter1.getAlter() + " und bin " + arbeiter1.getGeschlecht() + ". ich wiege " + arbeiter1.getGewicht());
        System.out.println("Mein Name ist: " + arbeiter2.getName() + " und verdiene " + arbeiter2.getGehalt() + " ich bin " + arbeiter2.getAlter() + " und bin " + arbeiter2.getGeschlecht() + ". ich wiege " + arbeiter2.getGewicht());
        System.out.println("Mein Name ist: " + arbeiter3.getName() + " und verdiene " + arbeiter3.getGehalt() + " ich bin " + arbeiter3.getAlter() + " und bin " + arbeiter3.getGeschlecht() + ". ich wiege " + arbeiter3.getGewicht());
        System.out.println("Mein Name ist: " + arbeiter4.getName() + " und verdiene " + arbeiter4.getGehalt() + " ich bin " + arbeiter4.getAlter() + " und bin " + arbeiter4.getGeschlecht() + ". ich wiege " + arbeiter4.getGewicht());
        System.out.println("Mein Name ist: " + arbeiter5.getName() + " und verdiene " + arbeiter5.getGehalt() + " ich bin " + arbeiter5.getAlter() + " und bin " + arbeiter5.getGeschlecht() + ". ich wiege " + arbeiter5.getGewicht());
        System.out.println("Mein Name ist: " + arbeiter6.getName() + " und verdiene " + arbeiter6.getGehalt() + " ich bin " + arbeiter6.getAlter() + " und bin " + arbeiter6.getGeschlecht() + ". ich wiege " + arbeiter6.getGewicht());

    }
}

       /* arbeiter1.zeigeAbteilungAn();
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
        e4.setNewAbteilung("D83");
        System.out.print("e1: "); e1.zeigeAbteilungAn();
        System.out.print("e4: "); e4.zeigeAbteilungAn(); */
