package application;

public class Datensatz {

	static String datenbankbesitzer;

	String telNummer;
	String name;
	String strasse;
	String plz;
	String ort;

	public Datensatz(String name, String telNummer, String strasse, String plz, String ort) {

		this.name = name;
		this.telNummer = telNummer;
		this.name = name;
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
	}

	public Datensatz(String name, String telNummer, String strasse) {

		this.telNummer = telNummer;
		this.name = name;
		this.strasse = strasse;
		this.plz = "80333";
		this.ort = "München";
	}

	public Datensatz(String name, String telNummer) {

		this.telNummer = telNummer;
		this.name = name;
		this.strasse ="Müllerstrasse 8";
		this.plz = "80333";
		this.ort = "München";
	}

}
