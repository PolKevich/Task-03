package by.training.task03.airlinetask;

public class Airline {

    private String destination;
    private String flightNumber;
    private String aircraftType;
    private String departureTime;
    private String daysOfTheWeek;

    public Airline(String destination, String flightNumber, String aircraftType,
                   String departureTime, String daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String toString() {
        String str ="Пункт назначения: " + destination + ". "+ "Номер рейса: " + flightNumber + ". "
                +"Тип самолета: "+ aircraftType + ". " + "Время вылета: "+ departureTime + ". " +
                "Дни недели: " + daysOfTheWeek + ". ";
        return str;
    }

    public void print() {
        System.out.println(toString());
    }
}
