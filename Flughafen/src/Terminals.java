public class Terminals {
        //DEKLARATIO
        Airlines[] _airlines;
        String _name;
        Airlines _airline;
    
        //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
        public Terminals (String name, Airlines airline) {
            this.setName(name);
            this.setAirlines(airline);
        }
    
        //GETTER
        public String getName(){
            return _name;
        }
        public Airlines getAirlines(){
            return _airline;
        }
    
        //SETTER
        public void setName(String name){
            _name = name;
        }    
        public void setAirlines(Airlines airline){
            _airline = airline;
        }       
}
