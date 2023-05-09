package model;

public class Event {
    private int id;
    private int customerId;
    private Customer customer;
    private String name;
    private String date;
    private String hour;
    private Place place;
    private Float price;
    private Integer numOfTicketsSold;

    public Event(int customerId, String name, String date, String hour, Place place, Float price, Integer numOfTicketsSold) {
        this.customerId = customerId;
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.place = place;
        this.price = price;
        this.numOfTicketsSold = numOfTicketsSold;
    }

    public Event(int id, int customerId, String name, String date, String hour, Place place, Float price, Integer numOfTicketsSold) {
        this(customerId, name, date, hour, place, price, numOfTicketsSold );
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public Place getPlace() {
        return place;
    }

    public Float getPrice() {
        return price;
    }

    public Integer getNumOfTicketsSold() {
        return numOfTicketsSold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setNumOfTicketsBought(Integer numOfTicketsSold) {
        this.numOfTicketsSold = numOfTicketsSold;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", place=" + place +
                ", price=" + price +
                ", numOfTicketsSold=" + numOfTicketsSold +
                '}';
    }
}
