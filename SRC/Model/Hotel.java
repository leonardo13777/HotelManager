package HotelManager.SRC.Model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    // Atributos
    private String name;
    private String adress;
    private int totalfloor;
    private int id;
    private List<Room> rooms;
    private float Tbh, Tcs, Tmi;
    
    // Constructor
    public Hotel(String nameHotel, String adressHotel, int floorHotel, int idHotel) {
        this.name = nameHotel;
        this.adress = adressHotel;
        setTotalfloor(floorHotel);
        this.id = idHotel;
        this.rooms = new ArrayList<>();
    }
    
    // Comprobación de ID único
    private boolean idExists(int idRoom) {
        for (Room r : this.rooms) {
            if (r.getId() == idRoom) {
                return true;
            }
        }
        return false;
    }

    // Métodos para crear cada tipo de habitación
    public RoomIndividual createIndividualRoom(int id, boolean lookSea, int floor, boolean tvPremiun) {
        if (idExists(id)) {
            throw new IllegalArgumentException("Ya existe una habitación con el ID: " + id);
        }
        RoomIndividual room = new RoomIndividual(this, id, lookSea, floor, tvPremiun);
        this.rooms.add(room);
        return room;
    }

    public RoomDouble createDoubleRoom(int id, boolean lookSea, int floor, boolean tvPremiun) {
        if (idExists(id)) {
            throw new IllegalArgumentException("Ya existe una habitación con el ID: " + id);
        }
        RoomDouble room = new RoomDouble(this, id, lookSea, floor, tvPremiun);
        this.rooms.add(room);
        return room;
    }

    public RoomFamily createFamilyRoom(int id, boolean lookSea, int floor, int camaSimple, boolean tvPremiun) {
        if (idExists(id)) {
            throw new IllegalArgumentException("Ya existe una habitación con el ID: " + id);
        }
        RoomFamily room = new RoomFamily(this, id, lookSea, floor, camaSimple, tvPremiun);
        this.rooms.add(room);
        return room;
    }

    public Suite createSuite(int id, boolean lookSea, int floor) {
        if (idExists(id)) {
            throw new IllegalArgumentException("Ya existe una habitación con el ID: " + id);
        }
        Suite room = new Suite(this, id, lookSea, floor);
        this.rooms.add(room);
        return room;
    }

    // Getters y Setters
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

    public int getTotalfloor() {
        return totalfloor;
    }

    public void setTotalfloor(int floor) {
        if (floor < 1) {
            throw new IllegalArgumentException("El hotel debe tener al menos 1 piso.");
        }
        this.totalfloor = floor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Room> getHabitaciones() {
        return rooms;
    }

    public float getTbh() {
        return Tbh;
    }

    public void setTbh(float tbh) {
        this.Tbh = tbh;
    }

    public float getTcs() {
        return Tcs;
    }

    public void setTcs(float tcs) {
        this.Tcs = tcs;
    }

    public float getTmi() {
        return Tmi;
    }

    public void setTmi(float tmi) {
        this.Tmi = tmi;
    }
}