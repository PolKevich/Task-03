package by.training.task03.airlinetask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AggregatingMass {

    Date d = new Date();

    ArrayList<Airline> arr = new ArrayList<>();

    public void addList(Airline a) {
        arr.add(a);

    }

    public void printAggregatingMass() {
        for (Airline a : arr) {
            System.out.println(a);
        }
    }

    public void listOfFlightsForDestination(String str) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getDestination().equals(str)) {
                System.out.println("номер рейса: " + arr.get(i).getFlightNumber());
            }

        }
    }

    public void listOfFlightsForDaysOfTheWeek(String day) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getDaysOfTheWeek().equals(day)) {
                System.out.println("рейс в ближайший день: " + arr.get(i).getFlightNumber());
            }

        }
    }

    public void listOfFlightsForDaysOfTheWeekAndDepartureTime(String day, String departureTime) throws ParseException {
        Date q = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        d = format.parse(departureTime);

        for (int i = 0; i < arr.size(); i++){
            q = format.parse(arr.get(i).getDepartureTime());

            if(arr.get(i).getDaysOfTheWeek().equals(day)){

                if(q.getTime() > d.getTime()){

                    System.out.println("время ближайшего рейса: " + arr.get(i).getFlightNumber() +
                            " отпровление " + arr.get(i).getDepartureTime() );
                }
            }

        }
    }

    }

