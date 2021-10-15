public class Terminal {
        //DEKLARATION
        String _name;
        String _airline;
    
        //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
        public Terminal (String name, String airline) {
            this.setName(name);
            this.setAirline(airline);
        }
    
        //GETTER
        public String getName(){
            return _name;
        }
        public String getAirline(){
            return _airline;
        }
    
        //SETTER
        public void setName(String name){
            _name = name;
        }    
        public void setAirline(String airline){
            _airline = airline;
        }       
}
