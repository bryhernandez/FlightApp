package edu.csumb.flightapp.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Reservation {

    @PrimaryKey(autoGenerate = true)
    long id;

//    private User user;
//    private Flight flight;
    private int numTix;
    private String from;
    private String to;
    private String flightNum;
    private double price;
    private String departureTime;

    //no arg constructor
    public Reservation() {
    }

    @Ignore
    public Reservation(User user, Flight flight, int numTix){
//       this.user = user;
//       this.flight = flight;
        this.numTix = numTix;
        flightNum = flight.getFlightNo();
        from = flight.getDeparture();
        to = flight.getArrival();
        price = flight.getPrice();
        departureTime = flight.getDepartureTime();
    }

    //getters
//  public User getUser() { return user; }
//
//  public Flight getFlight(){ return flight; }

    public String getFlightNum() { return flightNum; }

    public String getFrom(){ return from; }

    public String getTo(){ return to; }

    public double getPrice() { return price; }

    public String getDepartureTime(){ return departureTime; }

    public int getNumTix(){ return numTix; }

    //setters
//  public void setFlight(Flight flight){ this.flight = flight; }
//
//  public void setUser(User user){ this.user = user; }

    public void setFlightNum(String flightNum){ this.flightNum = flightNum; }

    public void setNumTix(int numTix) { this.numTix = numTix; }

    public void setFrom(String from){ this.from = from; }

    public void setTo(String to) { this.to = to; }

    public void setPrice(double price){ this.price = price; }

    public void setDepartureTime(String departureTime){ this.departureTime = departureTime; }

    //toString
    public String toString(){ return " "; }
}
