package HotelManager.SRC.Model;

public class Hotel {

    // Atributos

    private String name;
    private String adress;
    private int floor;
    private int id;
    private Room [] rooms;
    private float Tbh, Tcs, Tmi;
    
    // Constructor
    
    public Hotel(String nameHotel, String adressHotel, int floorHotel, int idHotel){
        
    }
    
    // Metodos

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Room [] getHabitaciones() {
        return rooms;
    }

    public void setHabitaciones(Room [] rooms) {
        this.rooms = rooms;
    }
    

    public float getTbh() {
        return Tbh;
    }

    public void setTbh(float tbh) {
        Tbh = tbh;
    }

    public float getTcs() {
        return Tcs;
    }

    public void setTcs(float tcs) {
        Tcs = tcs;
    }

    public float getTmi() {
        return Tmi;
    }

    public void setTmi(float tmi) {
        Tmi = tmi;
    }
}