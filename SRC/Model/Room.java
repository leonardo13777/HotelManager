package HotelManager.SRC.Model;

public class Room {

    // Atributos

    protected Hotel hotel;
    protected int floor;
    protected int id;
    protected String type;
    protected String State;
    protected int [] bedConfigurationRoom; 
    protected boolean lookSea;
    protected int ability;
    protected boolean tvPremiun;
    
    // Constructor
    public Room(String hotel, int idRoom, String typeRoom){

    }

    // Metodos

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int [] getBed() {
        return bed;
    }

    public void setBed(int [] bed) {
        this.bed = bed;
    }

    public int getLookSea() {
        return lookSea;
    }

    public void setLookSea(int lookSea) {
        this.lookSea = lookSea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }

    public double getTvPremiun() {
        return tvPremiun;
    }

    public void setTv(double tv) {
        this.tvPremiun = tv;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }
    
}
