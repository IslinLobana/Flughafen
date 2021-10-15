public class Airline {
      //DEKLARATION
      String _flugzeug;
      String _fluglinie;
      String _name;
  
      //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
      public Airline (String flugzeug, String fluglinie, String name) {
          this.setFlugzeug(flugzeug);
          this.setFluglinie(fluglinie);
          this.setName(name);
      }
  
      //GETTER
      public String getFlugzeug(){
          return _flugzeug;
      }
      public String getFluglinie(){
          return _fluglinie;
      }
      public String getName(){
        return _name;
        }
  
      //SETTER
      public void setFlugzeug(String flugzeug){
          _flugzeug = flugzeug;
      }    
      public void setFluglinie(String fluglinie){
          _fluglinie = fluglinie;
      }       
      public void setName(String name){
        _name = name;

    }    

}
