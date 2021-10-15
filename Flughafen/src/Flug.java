public class Flug {
       //DEKLARATION
       String _flugzeug;
       String _fluglinie;
       String _pilot;
       String _passagier;
       String _bahn;
       String _startzeit;
   
       //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
       public Flug (String flugzeug, String fluglinie, String pilot, String passagier, String bahn, String startzeit) {
           this.setFlugzeug(flugzeug);
           this.setFluglinie(fluglinie);
           this.setPilot(pilot);
           this.setPassagier(passagier);
           this.setBahn(bahn);
           this.setStartzeit(startzeit);
       }
   
       //GETTER
       public String getFlugzeug(){
           return _flugzeug;
       }
       public String getFluglinie(){
           return _fluglinie;
       }
        public String getPilot(){
            return _pilot;
        }
        public String getPassagier(){
            return _passagier;
        }
        public String getBahn(){
            return _bahn;
        }
        public String getStartzeit(){
            return _startzeit;
        }
   
       //SETTER
       public void setFlugzeug(String flugzeug){
           _flugzeug = flugzeug;
       }    
       public void setFluglinie(String fluglinie){
           _fluglinie = fluglinie;
       }       
       public void setPilot(String pilot){
        _pilot = pilot;
       }
       public void setPassagier(String passagier){
        _passagier = passagier;
    }    
    public void setBahn(String bahn){
        _bahn = bahn;
    }      
    public void setStartzeit(String startzeit){
        _startzeit = startzeit;
    }  

}
