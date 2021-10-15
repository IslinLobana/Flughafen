public class Pilot {
        //DEKLARATION
        String _vorname;
        String _nachname;
    
        //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
        public Pilot (String vorname, String nachname) {
            this.setVorname(vorname);
            this.setNachname(nachname);
        }
    
        //GETTER
        public String getVorname(){
            return _vorname;
        }
        public String getNachname(){
            return _nachname;
        }
    
        //SETTER
        public void setVorname(String vorname){
            _vorname = vorname;
        }    
        public void setNachname(String nachname){
            _nachname = nachname;
        }       
}
