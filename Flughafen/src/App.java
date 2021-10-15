import java.util.Scanner;


public class App {



    public static void addAirline(Airline airline){
        addObject(airline, getALLAirline());
    }
    static Airline[] _airline;
    public static Airline[] getALLAirline(){
        return _airline;
    }



    public static void addBahn(Bahn bahn){
        addObject(bahn, getALLBahn());
    }

    static Bahn [] _bahn;
    public static Bahn[] getALLBahn(){
        return _bahn;
    }


    public static Flug [] getALLFlug(){
        return _flug;
    }
    static Flug [] _flug;
    public static void addFlug(Flug flug){
        addObject(flug, getALLFlug());
    }


    public static Flughafen[] getALLFlughafen(){
        return _flughafen;
    }
    static Flughafen[] _flughafen;
    public static void addFlughafen(Flughafen flughafen){
        addObject(flughafen, getALLFlughafen());
    }


    public static Fluglinie[] getALLFluglinie(){
        return _fluglinie;
    }
    static Fluglinie[] _fluglinie;
    public static void addFluglinie(Fluglinie fluglinie){
        addObject(fluglinie, getALLFluglinie());
    }

    public static Flugzeug[] getALLFlugzeug(){
        return _flugzeug;
    }
    static Flugzeug[] _flugzeug;
    public static void addFlugzeug(Flugzeug flugzeug){
        addObject(flugzeug, getALLFlugzeug());
    }


    public static Passagier[] getALLPassagier(){
        return _passagier;
    }
    static Passagier[] _passagier;
    public static void addPassagier(Passagier passagier){
        addObject(passagier, getALLPassagier());
    }


    public static Pilot[] getALLPilot(){
        return _pilot;
    }
    static Pilot[] _pilot;
    public static void addPilot(Pilot pilot){
        addObject(pilot, getALLPilot());
    }

    public static Terminal[] getALLTerminal(){
        return _terminal;
    }
    static Terminal[] _terminal;
    public static void addTerminal(Terminal terminal){
        addObject(terminal, getALLTerminal());
    }

    //15 Punkte lösung:
    public static void addObject(Object ele, Object[] array){
        int i = 0;
        for (Object a :array){
            if(a == null){
                array[i] = ele;
                break;
            }
            i = i+1;
        }
    } 
    //Verkauefer Liste


    //Main-Methode ist immer der Einsteigspunkt des Programms
    public static void main(String[] args) throws Exception {
        //Initialisierung _autos --> In Klammer steht Anzahl der möglichen Elemente eines Arrays
        _airline = new Airline[8];
        _airline [0] = new Airline("BMW", "I3", "2020");
        _airline [1] = new Airline("Mercedes", "A220", "2019");
        _airline [2] = new Airline("VW", "Polo", "2005");
        
        //Initialisierung _kunden
        _bahn = new Bahn[8];
        _bahn [0] = new Bahn("Herbert");
        _bahn [1] = new Bahn("Hans");

        //Initialisierung _verkaeufe
        _flughafen = new Flughafen[8];
        _flughafen [0] = new Flughafen("Jordan", "Velte");
        _flughafen [1] = new Flughafen("Thomas", "Mueller");


        _fluglinie = new Fluglinie[8];
        _fluglinie [0] = new Fluglinie("Jordan");
        _fluglinie [1] = new Fluglinie("Thomas");


        _passagier= new Passagier[8];
        _passagier [0] = new Passagier("Jordan", "Velte");
        _passagier [1] = new Passagier("Thomas", "Mueller");


        _pilot = new Pilot[8];
        _pilot [0] = new Pilot("Jordan", "Velte");
        _pilot [1] = new Pilot("Thomas", "Mueller");
        
        //Neues Objekt der Klasse Menu
        Menu menu = new Menu();
        //Methode wird durch Punktnotation am Objekt aufgerufen
        menu.startMenu();
    }
}