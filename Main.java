public class Main {
    public static void main(String[] args) {
        Employee arbeiter1 = new Employee("Klaus", "Herny", 29031980, "männlich", 45, 74, "Herr Klaus ist immer unpünktlich");
        Employee arbeiter2 = new Employee("Klaus1", "Herny1", 02102000, "männlich", 25, 88, "reich");
        Employee arbeiter3 = new Employee("Klaus2", "Hern2", 02102001, "männlich", 24, 88, "reich");
        Employee arbeiter4 = new Employee("Klaus3", "Herny3", 02102002, "männlich", 23, 88, "reich");
        Employee arbeiter5 = new Employee("Klaus4", "Herny4", 02102003, "männlich", 22, 88, "reich");
        Employee arbeiter6 = new Employee("Klaus5", "Herny5", 02102004, "männlich", 21, 88, "reich");

        System.out.println("Mein Name ist: " + arbeiter1.getName()+" und verdiene " + arbeiter1.getGehalt()+" \nich bin " + arbeiter1.getAlter()+ " und bin "+ arbeiter1.getGeschlecht()+ ". ich wiege "+ arbeiter1.getGewicht());
        System.out.println("\r\nMein Name ist: " + arbeiter2.getName()+" und verdiene " + arbeiter2.getGehalt()+" \nich bin " + arbeiter2.getAlter()+ " und bin "+ arbeiter2.getGeschlecht()+ ". ich wiege "+ arbeiter2.getGewicht());
        System.out.println("\r\nMein Name ist: " + arbeiter3.getName()+" und verdiene " + arbeiter3.getGehalt()+" \nich bin " + arbeiter3.getAlter()+ " und bin "+ arbeiter3.getGeschlecht()+ ". ich wiege "+ arbeiter3.getGewicht());
        System.out.println("\r\nMein Name ist: " + arbeiter4.getName()+" und verdiene " + arbeiter4.getGehalt()+" \nich bin " + arbeiter4.getAlter()+ " und bin "+ arbeiter4.getGeschlecht()+ ". ich wiege "+ arbeiter4.getGewicht());
        System.out.println("\r\nMein Name ist: " + arbeiter5.getName()+" und verdiene " + arbeiter5.getGehalt()+" \nich bin " + arbeiter5.getAlter()+ " und bin "+ arbeiter5.getGeschlecht()+ ". ich wiege "+ arbeiter5.getGewicht());
        System.out.println("\r\nMein Name ist: " + arbeiter6.getName()+" und verdiene " + arbeiter6.getGehalt()+" \nich bin " + arbeiter6.getAlter()+ " und bin "+ arbeiter6.getGeschlecht()+ ". ich wiege "+ arbeiter6.getGewicht());
        


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

    }
}
