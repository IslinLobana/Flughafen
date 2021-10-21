public class Fluege {
       //DEKLARATION
       Flugzeuge[] _flugzeuge;
       Fluglinien[] _fluglinien;
       Piloten[] _piloten;
       Passagiere[] _passagiere;
       Bahnen[] _bahnen;


       Flugzeuge _flugzeug;
       Fluglinien _fluglinie;
       Piloten _pilot;
       Passagiere _passagier;
       Bahnen _bahn;
       String _startzeit;
   
       //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
       public Fluege (Flugzeuge flugzeug, Fluglinien fluglinie, Piloten pilot, Passagiere passagier, Bahnen bahn, String startzeit) {
           this.setFlugzeuge(flugzeug);
           this.setFluglinien(fluglinie);
           this.setPiloten(pilot);
           this.setPassagiere(passagier);
           this.setBahnen(bahn);
           this.setStartzeit(startzeit);
       }
   
       //GETTER
       public Flugzeuge getFlugzeuge(){
           return _flugzeug;
       }
       public Fluglinien getFluglinien(){
           return _fluglinie;
       }
        public Piloten getPiloten(){
            return _pilot;
        }
        public Passagiere getPassagiere(){
            return _passagier;
        }
        public Bahnen getBahnen(){
            return _bahn;
        }
        public String getStartzeit(){
            return _startzeit;
        }
   
       //SETTER
       public void setFlugzeuge(Flugzeuge flugzeug){
           _flugzeug = flugzeug;
       }    
       public void setFluglinien(Fluglinien fluglinie){
           _fluglinie = fluglinie;
       }       
       public void setPiloten(Piloten pilot){
        _pilot = pilot;
       }
       public void setPassagiere(Passagiere passagier){
        _passagier = passagier;
    }    
    public void setBahnen(Bahnen bahn){
        _bahn = bahn;
    }      
    public void setStartzeit(String startzeit){
        _startzeit = startzeit;
    }  

}
