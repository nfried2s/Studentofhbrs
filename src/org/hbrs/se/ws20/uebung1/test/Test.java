package org.hbrs.se.ws20.uebung1.test;

import org.hbrs.se.ws20.uebung1.control.*;
import org.hbrs.se.ws20.uebung1.view.*;


public class Test {

    private Client Client = null;

    private Translator translator = null;

    public Test(){
        Client = new Client();
        translator = new GermanTranslator();


    }

    public void test(){

        //Positivtests
        Client.display(7);
        Client.display(10);

        //Negativtests
        Client.display(11);
        Client.display(-1);
        Client.display(100);
        Client.display(0); //Spezial_Testfall
    }

    public static void main(String[] args) {
        Test pp = new Test();
        pp.test();
    }
}
