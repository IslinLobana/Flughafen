public class Airlines {
      //DEKLARATION
      String _name;
      String _flugzeug;
      String _fluglinie;    
  
      //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
      public Airlines (String flugzeug, String fluglinie, String name) {
          this.setFlugzeuge(flugzeug);
          this.setFluglinien(fluglinie);
          this.setName(name);
      }
  
      //GETTER
      public String getFlugzeuge(){
          return _flugzeug;
      }
      public String getFluglinien(){
          return _fluglinie;
      }
      public String getName(){
        return _name;
        }
  
      //SETTER
      public void setFlugzeuge(String flugzeug){
          _flugzeug = flugzeug;
      }    
      public void setFluglinien(String fluglinie){
          _fluglinie = fluglinie;
      }       
      public void setName(String name){
        _name = name;

    }    

}
