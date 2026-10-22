package HotelManager.SRC.Model;

public class Room {

    // Atributos

    protected int floor;
    protected String type;
    protected String State;
    protected bedConfiguration [] bed; 
    protected boolean lookSea;
    protected int id;
    protected int ability;
    protected boolean tv;
    
    // Constructor
    public Room(int floorRoom, int idRoom, String typeRoom){

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

    public bedConfiguration[] getBed() {
        return bed;
    }

    public void setBed(bedConfiguration[] bed) {
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

    public double getTv() {
        return tv;
    }

    public void setTv(double tv) {
        this.tv = tv;
    }
    
}
