public class Flugzeuge {
        //DEKLARATION
        String _nummer;
        int _passagiereMax;
        int _pilotenMax;
        String _hersteller;
    
        //CONSTRUCTOR. Parameterübergabe im Constructor für Setter-Methode mit Variablen --> Definiert "Regeln" für Deklaration der Variablen
        public Flugzeuge (String nummer, int passagiere, int piloten, String hersteller) {
            this.setNummer(nummer);
            this.setPassagiereMax(passagiere);
            this.setPilotenMax(piloten);
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
