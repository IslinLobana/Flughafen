public class Flugzeug {
        //DEKLARATION
        String _nummer;
        int _passagiereMax;
        int _pilotenMax;
        String _hersteller;
    
        //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
        public Flugzeug (String nummer, int passagiereMax, int pilotenMax, String hersteller) {
            this.setNummer(nummer);
            this.setPassagiereMax(passagiereMax);
            this.setPilotenMax(pilotenMax);
            this.setHersteller(hersteller);
        }
    
        //GETTER
        public String getNummer(){
            return _nummer;
        }
        public int getPassagiereMax(){
            return _passagiereMax;
        }
        public int getPilotenMax(){
            return _pilotenMax;
        }
        public String getHersteller(){
            return _hersteller;
        }
    
        //SETTER
        public void setNummer(String nummer){
            _nummer = nummer;
        }    
        public void setPassagiereMax(int passagiereMax){
            _passagiereMax = passagiereMax;
        }    
        public void setPilotenMax(int pilotenMax){
            _pilotenMax = pilotenMax;
        }    
        public void setHersteller(String hersteller){
            _hersteller = hersteller;
        }    
}
