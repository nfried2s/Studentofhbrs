package org.hbrs.se.ws20.uebung1.view;
import org.hbrs.se.ws20.uebung1.control.GermanTranslator;
/**
 * Realsierung einer Factory gemaess des Musters
 * Lösung Factory Method Pattern
 * Problem:Lösung von inkonsistenten Objekt-Erstellung
 * Vorteil: konsistente und zentrale Ereugung von Objekten
 */

public class Factory{
    public static GermanTranslator createGermanTranslator(){
        return new GermanTranslator();
    }
}