import java.util.Scanner;


public class App {



    public static void addAirline(Airlines airlines){
        addObject(airlines, getALLAirlines());
    }
    static Airlines[] _airlines;
    public static Airlines[] getALLAirlines(){
        return _airlines;
    }



    public static void addBahn(Bahnen bahnen){
        addObject(bahnen, getALLBahnen());
    }

    static Bahnen [] _bahnen;
    public static Bahnen[] getALLBahnen(){
        return _bahnen;
    }


    public static Fluege [] getALLFluege(){
        return _fluege;
    }
    static Fluege [] _fluege;
    public static void addFlug(Fluege fluege){
        addObject(fluege, getALLFluege());
    }


    public static Flughaefen[] getALLFlughaefen(){
        return _flughaefen;
    }
    static Flughaefen[] _flughaefen;
    public static void addFlughafen(Flughaefen flughaefen){
        addObject(flughaefen, getALLFlughaefen());
    }


    public static Fluglinien[] getALLFluglinien(){
        return _fluglinien;
    }
    static Fluglinien[] _fluglinien;
    public static void addFluglinie(Fluglinien fluglinien){
        addObject(fluglinien, getALLFluglinien());
    }

    public static Flugzeuge[] getALLFlugzeuge(){
        return _flugzeuge;
    }
    static Flugzeuge[] _flugzeuge;
    public static void addFlugzeug(Flugzeuge flugzeuge){
        addObject(flugzeuge, getALLFlugzeuge());
    }


    public static Passagiere[] getALLPassagiere(){
        return _passagiere;
    }
    static Passagiere[] _passagiere;
    public static void addPassagier(Passagiere passagiere){
        addObject(passagiere, getALLPassagiere());
    }


    public static Piloten[] getALLPiloten(){
        return _piloten;
    }
    static Piloten[] _piloten;
    public static void addPilot(Piloten piloten){
        addObject(piloten, getALLPiloten());
    }

    public static Terminals[] getALLTerminals(){
        return _terminals;
    }
    static Terminals[] _terminals;
    public static void addTerminal(Terminals terminals){
        addObject(terminals, getALLTerminals());
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
        _airlines = new Airlines[8];
        _airlines [0] = new Airlines("BMW", "I3", "2020");
        _airlines [1] = new Airlines("Mercedes", "A220", "2019");
        _airlines [2] = new Airlines("VW", "Polo", "2005");
        
        //Initialisierung _kunden
        _bahnen = new Bahnen[8];
        _bahnen [0] = new Bahnen("Herbert");
        _bahnen [1] = new Bahnen("Hans");

        //Initialisierung _verkaeufe
        _flughaefen = new Flughaefen[8];
        _flughaefen [0] = new Flughaefen("Jordan", "Velte");
        _flughaefen [1] = new Flughaefen("Thomas", "Mueller");


        _fluglinien = new Fluglinien[8];
        _fluglinien [0] = new Fluglinien("Jordan");
        _fluglinien [1] = new Fluglinien("Thomas");


        _flugzeuge = new Flugzeuge[8];
        _flugzeuge [0] = new Flugzeuge("Jordan", 200, 2, "Airbus");



        _passagiere= new Passagiere[8];
        _passagiere [0] = new Passagiere("Jordan", "Velte");
        _passagiere [1] = new Passagiere("Thomas", "Mueller");


        _piloten = new Piloten[8];
        _piloten [0] = new Piloten("Jordan", "Velte");
        _piloten [1] = new Piloten("Thomas", "Mueller");
        
        //Neues Objekt der Klasse Menu
        Menu menu = new Menu();
        //Methode wird durch Punktnotation am Objekt aufgerufen
        menu.startMenu();
    }
}