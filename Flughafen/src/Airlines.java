public class Airlines {
      String _name;
      Flugzeuge[] _flugzeuge;
      Fluglinien[] _fluglinien;    

      Flugzeuge _flugzeug;
      Fluglinien _fluglinie;
  
      public Airlines ( String name, Flugzeuge flugzeuge, Fluglinien fluglinien) {
          this.setFlugzeuge(flugzeuge);
          this.setFluglinien(fluglinien);
          this.setName(name);
      }
      //GETTER
      public String getName(){
        return _name;
        }
        public Flugzeuge getFlugzeuge(){
            return _flugzeug;
            }
            public Fluglinien getFluglinien(){
                return _fluglinie;
                }
      //SETTER
      public void setName(String name){
        _name = name;

    }    
    public void setFlugzeuge(Flugzeuge flugzeug){
        _flugzeug = flugzeug;

    }  
    public void setFluglinien(Fluglinien fluglinie){
        _fluglinie = fluglinie;

    }  

}
