package org.hbrs.se.ws20.uebung1.view;
import org.hbrs.se.ws20.uebung1.view.Factory;
import org.hbrs.se.ws20.uebung1.control.GermanTranslator;
import org.hbrs.se.ws20.uebung1.control.Translator;
class Client {

	/*
	 * Methode zur Ausgabe einer Zahl auf der Console
	 */
	public void display( int aNumber ){
		// In dieser Methode soll die Methode translateNumber
		// mit dem übergegebenen Wert der Variable aNumber
		// aufgerufen werden.
		// Strenge Implementierung gegen das Interface Translator gewuenscht!

		//normalerweise mit new
		Translator translator = Factory.createGermanTranslator();//new Germanstranslator();
		String result = translator.translateNumber(1);


		System.out.println("Das Ergebnis der Berechnung: " +
				"[das Ergebnis an dieser Stelle]" );
		//translator = Factory.createEnglishTranslator();

	}
}


