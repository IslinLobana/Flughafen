public class Fluglinie {
        //DEKLARATION
        String _name;

    
        //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
        public Fluglinie (String name) {
            this.setName(name);

        }
    
        //GETTER
        public String getName(){
            return _name;
        }
       
    
        //SETTER
        public void setName(String name){
            _name = name;
        }    
    }
