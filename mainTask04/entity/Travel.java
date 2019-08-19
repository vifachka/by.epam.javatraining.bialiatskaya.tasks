/**
 * EPAM JavaTraining-Intro. Task 4.
 * Abstract class for travelling
 *
 * @author Natallia Bialiatskaya
 * @version 1.0
 * @since 07.08.2019
 */
package by.epam.javatraining.bialiatskaya.tasks.mainTask04.entity;

import by.epam.javatraining.bialiatskaya.tasks.mainTask04.enums.*;

import java.util.Objects;

abstract public class Travel {
    private String travel = "";
    private String transport = "";
    private String catering = "";
    private int duration = 0;
    private String departure = "";
    private String destination = "";

    public Travel(String travel, String transport, String catering, int duration, String departure, String destination){
        this.travel = travel;
        this.transport = transport;
        this.catering = catering;
        this.duration = duration;
        this.departure = departure;
        this.destination = destination;
    }

    public String getTravel() {
        return travel;
    }

    public void setTravel(String travel) {
        this.travel = travel;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getCatering() {
        return catering;
    }

    public void setCatering(String catering) {
        this.catering = catering;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return TravelType.valueOf(travel).ordinal() * 1_000_000 +
                TransportType.valueOf(transport).ordinal() * 100_000+
                CateringType.valueOf(catering).ordinal() * 10_000+
                DeparturePoint.valueOf(departure).ordinal() * 1000 +
                DestinationPoint.valueOf(destination).ordinal() * 100 +
                duration;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "travel='" + travel + '\'' +
                ", transport='" + transport + '\'' +
                ", catering='" + catering + '\'' +
                ", duration=" + duration +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}