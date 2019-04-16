package application;

import java.util.HashMap;

// Singleton design pattern

public class DatenSpeicher {

	// HashMap: Key: Name Value : Datensatz (Datensatz)
	// HashMap: Key: Name Value: telnummer (String)

	static HashMap<String, Datensatz> map;

	private static DatenSpeicher speicher;

	public static DatenSpeicher getDatenSpeicher() { // Singelton Design Pattern

		if (speicher == null) {
			speicher = new DatenSpeicher();
		}
		return speicher;
	}

	private DatenSpeicher() {

		Datensatz[] da = {
				new Datensatz("Arthur Abraxas", "01767273303", "Bernhardstrasse 23", "43433", "Valencia"),
				new Datensatz("Bert Beckenbauer", "1968"),
				new Datensatz("Christa Coriolis", "2968"),
				new Datensatz("Matze Mader", "4343"),
				new Datensatz("Nora Nederland", "1223"),
				new Datensatz("Ottilie Otten", "4341"),
				new Datensatz("Peter Pan", "089-1871"),
				new Datensatz("Quast Quandt", "13213", "Weissnichtstrasse 9"),
				new Datensatz("Willi Wonka", "0043/7242/234323"),
				new Datensatz("Zenzi Zacherl", "4711"),
				new Datensatz("Dennis Müller", "01764555555"),
				new Datensatz("Kurt Knispel", "099017467"),
				new Datensatz("Michael Wittmann", "0895465656"),
				new Datensatz("Johannes Bölter	", "089656565"),
				new Datensatz("Otto Carius", "6666544"),
				new Datensatz("Dmitriy Lavrinenkol", "166667"),
				new Datensatz("Lafayette G. Pool", "792113"),
				new Datensatz("Sydney V. Radley-Walters", "7133333"),
				new Datensatz("Zvika Greengold ", "08946664"),
				new Datensatz("Max Immelmann", "0175488")
		};

		map = new HashMap<String,Datensatz>();

		for(Datensatz d : da) {
			String key = d.name.toLowerCase();
			map.put(key, d);
		}
	}

	public static Datensatz nachschlagen(String name) {

		Datensatz d = map.get(name.toLowerCase());
		return d;
	}

}
