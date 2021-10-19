import java.util.Scanner;

public class Menu {
    Scanner _scanner;

    public Menu(){
        this.setScanner(new Scanner(System.in));
    }

    
    public void setScanner(Scanner _scanner) {
        this._scanner = _scanner;
    }
    public Scanner getScanner() {
        return _scanner;
    }
    //Menu-Methode
    public void startMenu(){
        System.out.println("Bitte wähle aus:");
        System.out.println("(1) Neue Airline");
        System.out.println("(2) Neue Bahn");
        System.out.println("(3) Neuer Flug");
        System.out.println("(4) Neue Fluglinie");
        System.out.println("(5) Neues FLugzeug");
        System.out.println("(6) Neuer Passagier");
        System.out.println("(7) Neuer Pilot");
        System.out.println("(8) Neue Terminals");
        System.out.println("(9) Zeige alle Airlines");
        System.out.println("(10) Zeige alle Bahnen");
        System.out.println("(11) Zeige alle Flüge");
        System.out.println("(12) Zeige den Flughafen");
        System.out.println("(13) Zeige alle Fluglinien");
        System.out.println("(14) Zeige alle Flugzeuge");
        System.out.println("(15) Zeige alle Passagiere");
        System.out.println("(16) Zeige alle Piloten");
        System.out.println("(17) Zeige alle Terminals");
        String choice = getScanner().nextLine();
        System.out.println("Deine Auswahl ist: " + choice);

        if(choice.equals("1")){
            createAirlineMenu();
        }
        else if(choice.equals("2")){
            createBahnMenu();
        }
        else if(choice.equals("3")){
            createFlugMenu();
        }
        else if(choice.equals("4")){
            createFluglinieMenu();
        }
        else if(choice.equals("5")){
            createFlugzeugMenu();
        }
        else if(choice.equals("6")){
            createPassagierMenu();
        }
        else if(choice.equals("7")){
            createPilotMenu();
        }
        else if(choice.equals("8")){
            createTerminalMenu();
        }
        else if(choice.equals("9")){
            showAirlines();
        }
        else if(choice.equals("10")){
            showBahnen();
        }
        else if(choice.equals("11")){
            showFluege();
        }
        else if(choice.equals("12")){
            showFlughaefen();
        }
        else if(choice.equals("13")){
            showFluglinien();
        }
        else if(choice.equals("14")){
            showFlugzeuge();
        }
        else if(choice.equals("15")){
            showPassagiere();
        }
        else if(choice.equals("16")){
            showPiloten();
        }
        else if(choice.equals("17")){
            showTerminals();
        }
        else{
            System.out.println("Bitte nur 1 - 17 eingeben!");
        }
        startMenu();
    }

  
    public void showAirlines(){
        //For-Each Schleife
        for (Airlines airlines : App.getALLAirlines()){
            if(airlines != null){
                //System.out.println("Flugzeug: " + airlines.getFlugzeuge().getNummer() + " " + airlines.getFlugzeuge().getPassagiereMax() + " " + airlines.getFlugzeuge().getPilotenMax() + " " + airlines.getFlugzeuge().getHersteller() + " Fluglinie: " + airlines.getFluglinien().getName() + " Name: " + airlines.getName());
            }
        }
    }
    public void showBahnen(){
        for (Bahnen bahnen : App.getALLBahnen()){
            if(bahnen != null){
                System.out.println(bahnen.getName());
            }
        }
    }
    public void showFluege(){
        //For-Each Schleife
        for (Fluege fluege : App.getALLFluege()){
            if(fluege != null){
                //System.out.println(fluege.getFlugzeuge().getNummer() + " " + fluege.getFlugzeuge().getPassagiereMax() + " " + fluege.getFlugzeuge().getPilotenMax() + " " + fluege.getFlugzeuge().getHersteller() + " Fluglinie: " + fluege.getFluglinien().getName() + " Piloten: " + fluege.getPiloten().getVorname() + " " + fluege.getPiloten().getNachname() + " Passagiere: " + fluege.getPassagiere().getVorname() + " " + fluege.getPassagiere().getNachname() + " Bahn: " + fluege.getBahnen().getName() + " " + fluege.getStartzeit());
            }
        }
    }
    public void showFlughaefen(){
        for (Flughaefen flughaefen : App.getALLFlughaefen()){
            if(flughaefen != null){
                System.out.println(flughaefen.getName() + " " + flughaefen.getStandort());
            }
        }
    }
    public void showFluglinien(){
        for (Fluglinien fluglinien : App.getALLFluglinien()){
            if(fluglinien != null){
                System.out.println(fluglinien.getName());
            }
        }
    }
    public void showFlugzeuge(){
        for (Flugzeuge flugzeuge : App.getALLFlugzeuge()){
            if(flugzeuge != null){
                System.out.println(flugzeuge.getNummer() + " " + flugzeuge.getPassagiereMax() + " " + flugzeuge.getPilotenMax() + " " + flugzeuge.getHersteller());
            }
        }
    }
    public void showPassagiere(){
        for (Passagiere passagiere : App.getALLPassagiere()){
            if(passagiere != null){
                System.out.println(passagiere.getVorname()+ " " + passagiere.getNachname());
            }
        }
    }
    public void showPiloten(){
        for (Piloten piloten : App.getALLPiloten()){
            if(piloten != null){
                System.out.println(piloten.getVorname() + " " + piloten.getNachname());
            }
        }
    }
    public void showTerminals(){
        for (Terminals terminals: App.getALLTerminals()){
            if(terminals != null){
                //System.out.println(terminals.getName() + " Flugzeug: " + terminals.getAirlines().getFlugzeuge().getNummer() + " " + terminals.getAirlines().getFlugzeuge().getPassagiereMax() + " " + terminals.getAirlines().getFlugzeuge().getPilotenMax() + " " + terminals.getAirlines().getFlugzeuge().getHersteller() + " Fluglinie: " + terminals.getAirlines().getFluglinien().getName());
            }
        }
    }





    public void createAirlineMenu(){
        System.out.println("Airline erstellen.");
        System.out.print("Geben Sie den Namen ein: ");
        String choicename = getScanner().nextLine();
        int a = 0;
        System.out.println("Bitte wähle ein Flugzeug aus: ");
        for(Flugzeuge flugzeuge : App.getALLFlugzeuge()){
            if(flugzeuge != null){
                System.out.println(a + " - " + flugzeuge.getNummer() + " " + flugzeuge.getPassagiereMax() + " " + flugzeuge.getPilotenMax() + " " + flugzeuge.getHersteller());
                a++;
            }
        }
                // Eingabe des Strings
                String flugzeugchoice = getScanner().next();
                //Ausgabe des Arrays mit den Autos! Eckige Klammern wählen das richtige Element des Arrays!
                System.out.println(App.getALLFlugzeuge());
               
                a = 0;
        int b = 0;
        System.out.println("Bitte wähle eine Fluglinie aus: ");
        for(Fluglinien fluglinien : App.getALLFluglinien()){
            if(fluglinien != null){
                System.out.println(b + " - " + fluglinien.getName());
                b++;
            }
        }
                // Eingabe des Strings
                String flugliniechoice = getScanner().next();
                //Ausgabe des Arrays mit den Autos! Eckige Klammern wählen das richtige Element des Arrays!
                System.out.println(App.getALLFluglinien());
               
                b = 0;
        System.out.println("Es wurde eine neue Airline eingetragen.");
        App.addAirline(new Airlines(choicename, flugzeugchoice, flugliniechoice));
        System.out.println(App.getALLAirlines());
    }

    public void createBahnMenu(){
        System.out.println("Bahn erstellen.");
        System.out.print("Geben Sie den Namen ein:");
        String choicename = getScanner().nextLine();
        System.out.println("Es wurde eine neue Bahn eingetragen.");
        App.addBahn(new Bahnen(choicename));
        System.out.println(App.getALLBahnen()); 




    }
    public void createFlugMenu(){
        System.out.println("Flug erstellen.");
        System.out.println("Bitte wähle ein Flugzeug aus: ");
        int a = 0;
        for(Flugzeuge flugzeuge : App.getALLFlugzeuge()){
            if(flugzeuge != null){
                System.out.println(a + " - " + flugzeuge.getNummer() + " " + flugzeuge.getPassagiereMax() + " " + flugzeuge.getPilotenMax() + " " + flugzeuge.getHersteller());
                a++;
            }
        }
                // Eingabe des Strings
                String flugzeugchoice = getScanner().next();
                //Ausgabe des Arrays mit den Autos! Eckige Klammern wählen das richtige Element des Arrays!
                System.out.println(App.getALLFlugzeuge());
               
                a = 0;
        int b = 0;
        System.out.println("Bitte wähle eine Fluglinie aus: ");
        for(Fluglinien fluglinien : App.getALLFluglinien()){
            if(fluglinien != null){
                System.out.println(b + " - " + fluglinien.getName());
                b++;
            }
        }
                // Eingabe des Strings
                String flugliniechoice = getScanner().next();
                //Ausgabe des Arrays mit den Autos! Eckige Klammern wählen das richtige Element des Arrays!
                System.out.println(App.getALLFluglinien());
               
                b = 0;
                
        int c = 0;
        System.out.println("Bitte wähle einen Piloten aus: ");
        for(Piloten piloten: App.getALLPiloten()){
            if(piloten != null){
                System.out.println(c+ " - " + piloten.getVorname() + " " + piloten.getNachname());
                c++;
            }
        }
                // Eingabe des Strings
                String pilotchoice = getScanner().next();
                //Ausgabe des Arrays mit den Autos! Eckige Klammern wählen das richtige Element des Arrays!
                System.out.println(App.getALLPiloten());
               
                c = 0;
        int d = 0;
        System.out.println("Bitte wähle Passagiere aus: ");
        for(Passagiere passagiere : App.getALLPassagiere()){
            if(passagiere != null){
                System.out.println(d + " - " + passagiere.getVorname()+ " " + passagiere.getNachname());
                d++;
            }
        }
        // Eingabe des Strings
    String passagierchoice = getScanner().next();
    System.out.println(App.getALLPassagiere());
               
        d = 0;
        int e = 0;
            System.out.println("Bitte wähle eine Bahn aus: ");
                for(Bahnen bahnen : App.getALLBahnen()){
                    if(bahnen != null){
                        System.out.println(e + " - " + bahnen.getName());
                        e++;
                    }
                }
    // Eingabe des Strings
    String bahnchoice = getScanner().next();
    System.out.println(App.getALLPassagiere());
                       
    System.out.print("Geben Sie die Startzeit ein:");
    String startzeitchoice = getScanner().nextLine();


        System.out.println("Es wurde ein neuer Flug eingetragen.");
        App.addFlug(new Fluege(flugzeugchoice, flugliniechoice, pilotchoice, passagierchoice, bahnchoice, startzeitchoice));
        System.out.println(App.getALLFluege());
    }
    public void createFluglinieMenu(){
        System.out.println("Fluglinie erstellen.");
        System.out.print("Geben Sie den Namen ein:");
        String choicename = getScanner().nextLine();
        System.out.println("Es wurde eine neue Fluglinie eingetragen.");
        App.addFluglinie(new Fluglinien(choicename));
        System.out.println(App.getALLFluglinien());
    }
    

    public void createFlugzeugMenu(){
        System.out.println("Flugzeug erstellen.");
        System.out.print("Geben Sie die Nummer ein:");
        String choicenummer = getScanner().nextLine();
        System.out.print("Geben Sie die maximalen Passagiere ein:");
        String choicepassagiere = getScanner().next();
        int passagieremax = Integer.valueOf(choicepassagiere);
        System.out.print("Geben Sie die maximalen Piloten ein:");
        String choicepiloten = getScanner().next();
        int pilotenmax = Integer.valueOf(choicepiloten);
        System.out.print("Geben Sie den Hersteller ein:");
        String choicehersteller = getScanner().nextLine();
        System.out.println("Es wurde ein neues Flugzeug eingetragen.");
        App.addFlugzeug(new Flugzeuge(choicenummer, passagieremax, pilotenmax, choicehersteller));
        System.out.println(App.getALLFlugzeuge());
    }  


    public void createPassagierMenu(){
        System.out.println("Passagier erstellen.");
        System.out.print("Geben Sie den Vornamen ein:");
        String choicevorname = getScanner().nextLine();
        System.out.print("Geben Sie den Nachnamen ein:");
        String choicenachname = getScanner().next();
        System.out.println("Es wurde ein neuer Passagier eingetragen.");
        App.addPassagier(new Passagiere(choicevorname, choicenachname));
        System.out.println(App.getALLPassagiere());
    }  


    public void createPilotMenu(){
        System.out.println("Pilot erstellen.");
        System.out.print("Geben Sie den Vornamen ein:");
        String choicevorname = getScanner().nextLine();
        System.out.print("Geben Sie den Nachnamen ein:");
        String choicenachname = getScanner().next();
        System.out.println("Es wurde ein neuer Pilote eingetragen.");
        App.addPilot(new Piloten(choicevorname, choicenachname));
        System.out.println(App.getALLPiloten());
    }  


    public void createTerminalMenu(){
        System.out.println("Terminal erstellen.");
        System.out.print("Geben Sie den Namen ein:");
        String choicename = getScanner().nextLine();
        int a = 0;
        for(Airlines airlines : App.getALLAirlines()){
            if(airlines != null){
                //System.out.println("Flugzeug: " + airlines.getFlugzeuge().getNummer() + " " + airlines.getFlugzeuge().getPassagiereMax() + " " + airlines.getFlugzeuge().getPilotenMax() + " " + airlines.getFlugzeuge().getHersteller() + " Fluglinie: " + airlines.getFluglinien().getName() + " Name: " + airlines.getName());
                a++;
            }
        }
                // Eingabe des Strings
                String flugzeugchoice = getScanner().next();
                //Ausgabe des Arrays mit den Autos! Eckige Klammern wählen das richtige Element des Arrays!
                System.out.println(App.getALLFlugzeuge());
               
                a = 0;
        }
}

