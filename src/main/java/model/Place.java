package model;

public class Place {
    private int id;

    private int eventId;
    private Event event;
    private String name;
    private String address;
    private Integer capacity;

    public Place(int eventId, String name, String address, Integer capacity) {
        this.eventId = eventId;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    public Place(int id, int eventId, String name, String address, Integer capacity) {
        this(eventId,name,address,capacity);
        this.id = id;
    }

    public int getEventId() {
        return eventId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
