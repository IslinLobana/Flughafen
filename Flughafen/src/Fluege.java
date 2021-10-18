public class Fluege {
       //DEKLARATION
       String _flugzeug;
       String _fluglinie;
       String _pilot;
       String _passagier;
       String _bahn;
       String _startzeit;
   
       //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
       public Fluege (String flugzeug, String fluglinie, String pilot, String passagier, String bahn, String startzeit) {
           this.setFlugzeuge(flugzeug);
           this.setFluglinien(fluglinie);
           this.setPiloten(pilot);
           this.setPassagiere(passagier);
           this.setBahnen(bahn);
           this.setStartzeit(startzeit);
       }
   
       //GETTER
       public String getFlugzeuge(){
           return _flugzeug;
       }
       public String getFluglinien(){
           return _fluglinie;
       }
        public String getPiloten(){
            return _pilot;
        }
        public String getPassagiere(){
            return _passagier;
        }
        public String getBahnen(){
            return _bahn;
        }
        public String getStartzeit(){
            return _startzeit;
        }
   
       //SETTER
       public void setFlugzeuge(String flugzeug){
           _flugzeug = flugzeug;
       }    
       public void setFluglinien(String fluglinie){
           _fluglinie = fluglinie;
       }       
       public void setPiloten(String pilot){
        _pilot = pilot;
       }
       public void setPassagiere(String passagier){
        _passagier = passagier;
    }    
    public void setBahnen(String bahn){
        _bahn = bahn;
    }      
    public void setStartzeit(String startzeit){
        _startzeit = startzeit;
    }  

}
