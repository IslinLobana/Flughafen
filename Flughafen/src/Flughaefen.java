public class Flughaefen {
     //DEKLARATION
     String _name;
     String _standort;
 
     //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
     public Flughaefen (String name, String standort) {
         this.setName(name);
         this.setStandort(standort);
     }
 
     //GETTER
     public String getName(){
         return _name;
     }
     public String getStandort(){
         return _standort;
     }
 
     //SETTER
     public void setName(String name){
         _name = name;
     }    
     public void setStandort(String standort){
         _standort = standort;
     }       
}