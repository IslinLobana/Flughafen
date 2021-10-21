public class App {

    static Airlines[] _airlines;
    static Bahnen[] _bahnen;
    static Fluege[] _fluege;
    static Flughaefen[] _flughaefen;
    static Fluglinien[] _fluglinien;
    static Flugzeuge[] _flugzeuge;
    static Passagiere[] _passagiere;
    static Piloten[] _piloten;
    static Terminals[] _terminals;


    public static void addAirline(Airlines airlines){
        addObject(airlines, getALLAirlines());
    }
    public static Airlines[] getALLAirlines(){
        return _airlines;
    }



    public static void addBahn(Bahnen bahnen){
        addObject(bahnen, getALLBahnen());
    }

    public static Bahnen[] getALLBahnen(){
        return _bahnen;
    }


    public static Fluege [] getALLFluege(){
        return _fluege;
    }
    public static void addFlug(Fluege fluege){
        addObject(fluege, getALLFluege());
    }


    public static Flughaefen[] getALLFlughaefen(){
        return _flughaefen;
    }
    public static void addFlughafen(Flughaefen flughaefen){
        addObject(flughaefen, getALLFlughaefen());
    }


    public static Fluglinien[] getALLFluglinien(){
        return _fluglinien;
    }
    public static void addFluglinie(Fluglinien fluglinien){
        addObject(fluglinien, getALLFluglinien());
    }

    public static Flugzeuge[] getALLFlugzeuge(){
        return _flugzeuge;
    }
    public static void addFlugzeug(Flugzeuge flugzeuge){
        addObject(flugzeuge, getALLFlugzeuge());
    }


    public static Passagiere[] getALLPassagiere(){
        return _passagiere;
    }
    public static void addPassagier(Passagiere passagiere){
        addObject(passagiere, getALLPassagiere());
    }


    public static Piloten[] getALLPiloten(){
        return _piloten;
    }
    public static void addPilot(Piloten piloten){
        addObject(piloten, getALLPiloten());
    }

    public static Terminals[] getALLTerminals(){
        return _terminals;
    }
    public static void addTerminal(Terminals terminals){
        addObject(terminals, getALLTerminals());
    }

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


    public static void main(String[] args) throws Exception {
       /* _airlines = new Airlines[8];
        _airlines [0] = new Airlines("BMW", "I3", "2020");
        _airlines [1] = new Airlines("Mercedes", "A220", "2019");
        _airlines [2] = new Airlines("VW", "Polo", "2005");*/
        
        _bahnen = new Bahnen[8];
        _bahnen [0] = new Bahnen("Nordwest");
        _bahnen [1] = new Bahnen("Süden");

        _flughaefen = new Flughaefen[8];
        _flughaefen [0] = new Flughaefen("Helmut Schmidt Flughafen", "Hamburg");


        _fluglinien = new Fluglinien[8];
        _fluglinien [0] = new Fluglinien("HAM-MUN");
        _fluglinien [1] = new Fluglinien("HAM-NYC");


        _flugzeuge = new Flugzeuge[8];
        _flugzeuge [0] = new Flugzeuge("777", 227, 2, "Boeing");
        _flugzeuge [0] = new Flugzeuge("767", 375, 2, "Boeing");
        _flugzeuge [0] = new Flugzeuge("737", 294, 2, "Boeing");



        _passagiere= new Passagiere[8];
        _passagiere [0] = new Passagiere("Nils", "Ahsendorf");
        _passagiere [1] = new Passagiere("Holger", "Trampe");


        _piloten = new Piloten[8];
        _piloten [0] = new Piloten("Andreas", "Lubitz");
        _piloten [1] = new Piloten("Mike", "hoxlong");


        /*_piloten = new Piloten[8];
        _piloten [0] = new Piloten("Andreas", "Lubitz");
        _piloten [1] = new Piloten("Mike", "hoxlong");*/
        
        Menu menu = new Menu();
        menu.startMenu();
    }
}