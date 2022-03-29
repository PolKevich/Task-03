package by.training.task03.airlinetask;
/*
Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
set- и get- методы и метод  toString(). Создать второй класс, агрегирующий массив или коллекцию типа Airline,
с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.

Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import java.text.ParseException;

public class AirlineTask {

    public static void main(String[] args) throws ParseException {

        Airline airline1 = new Airline("Ханой", "TK 0378", "Airbus A310",
                "21.03.22 12:10","пн");
        Airline airline2 = new Airline("Исламабад", "OR 0123", "Boeing-737",
                "23.03.22 22:30","ср");
        Airline airline3 = new Airline("Катманду", "KK 0645", "SuperJet-100",
                "25.03.22 00:30","пт");

        AggregatingMass a1 = new AggregatingMass();

        a1.addList(airline1);
        a1.addList(airline2);
        a1.addList(airline3);

        a1.printAggregatingMass();
        System.out.println();

// a) список рейсов для заданного пункта назначения;

        a1.listOfFlightsForDestination("Ханой");
        System.out.println();

// b) список рейсов для заданного дня недели;

        a1.listOfFlightsForDaysOfTheWeek("пт");
        System.out.println();

// c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

        a1.listOfFlightsForDaysOfTheWeekAndDepartureTime("ср", "23.03.22 20:30");

    }
}
