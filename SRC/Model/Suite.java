package HotelManager.SRC.Model;

public class Suite extends Room {

    // Atributos

    private boolean minibar;
    

    // Constructor 

    public  Suite(String hotel, int id, String type, String state, int floor, int [] bed, boolean lookSea){
        super(hotel, id, type);
        setFloor(floor);
        setBedConfiguration(bed);
        setLookSea(lookSea);
        setAbility(bed);
        this.minibar = true;
        this.tvPremiun = true;

    }

    // Metodos 

    public void setFloor( int floor){
        if (floor == getFloor() || floor == (getFloor() - 1)){
            this.floor = floor;
        } else{
            throw new IllegalAccessException("El piso de la suite es invalido");
        }
    }
    
    public void setBedConfiguration(int [] bed){
        if(comprobation(bed[0])){
            if(coprobation(bed[1])){
                this.bedConfigurationRoom = bed;
            }
        }
    }
    
    public void setLookSea(boolean look){
        this.lookSea = look;
    }

    public void setAbility(int [] bed ){
        int ability = 0;
        ability = bed[1] * 2;
        ability += bed[0];
        this.ability = ability;
    }

    public static comprobation(int number){
        if (number < 0){
            throw new IllegalAccessException("No se puedo añadir un valor negativo");
        }
        return true;
    }

    public boolean isMinibar() {
        return minibar;
    }
    
}
