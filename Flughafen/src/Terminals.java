public class Terminals {
        //DEKLARATION
        String _name;
        String _airline;
    
        //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
        public Terminals (String name, String airline) {
            this.setName(name);
            this.setAirlines(airline);
        }
    
        //GETTER
        public String getName(){
            return _name;
        }
        public String getAirlines(){
            return _airline;
        }
    
        //SETTER
        public void setName(String name){
            _name = name;
        }    
        public void setAirlines(String airline){
            _airline = airline;
        }       
}
