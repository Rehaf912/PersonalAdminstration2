public class Employee {
    private String name;
    private String vorname;
    private int  geburtsdatum;
    private String geschlecht;
    private int alter;
    private double gewicht;
    private String abteilung;
    private double gehalt;
    private int dienstjahre;
    private String besonderheiten;


    public Employee(String name, String vorname, int geburtsdatum, String geschlecht, int alter, double gewicht, String besonderheiten){
        dienstjahre = 0;
        gehalt = 1500;
        abteilung = "A38";

        this.name = name;
        this.vorname = vorname;
        this.geburtsdatum = geburtsdatum;
        this.geschlecht = geschlecht;
        this.alter = alter;
        this.gewicht = gewicht;
        this.besonderheiten = besonderheiten;
    }
    public void setNewAbteilung(String newAbteilung){
        this.abteilung = newAbteilung;
    }
    public void zeigeAbteilungAn(){
    System.out.println("Ich bin in der Abteilung: " + abteilung);
    }
}

