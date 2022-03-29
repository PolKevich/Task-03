package by.training.task03.customertask;

import java.util.ArrayList;
import java.util.Comparator;


public class AggregatingMass implements Comparator< Customer > {

    ArrayList <Customer> list = new ArrayList<>();

    public void addList(Customer c) {
        list.add(c);

    }

    public void printAggregatingMass (){
        for(Customer c : list ){
            System.out.println(c);
        }

    }

// Сортировка с помощью Comparator

    @Override
    public int compare(Customer c1, Customer c2) {
       if (c1.getSurname().equals(c2.getSurname())) {
            return c1.getSurname().compareTo(c2.getSurname());
        }

       if (c1.getName().equals(c2.getName())) {
            return c1.getName().compareTo(c2.getName());
        }

        return c1.getPatronymic().compareTo(c2.getPatronymic());

    }

    // Сортировка с помощью bubbles

    public void bubblesSort(){
        boolean sorted = false;
        Customer temp;
        while (!sorted){
            sorted = true;

            for (int i = 0; i < list.size() - 1; i++){
               if(list.get(i).getSurname().compareTo(list.get(i + 1).getSurname()) > 0){
                   temp = list.get(i);
                   list.set(i, list.get(i + 1));
                   list.set(i + 1, temp);
                   sorted = false;

               }
            }
        }
    }

    public void interval(int min, int max){
        for(Customer c : list ){
            if(c.getCreditCardNumber() > min && c.getCreditCardNumber() < max ){
                System.out.println(c);

            }
        }


    }

}
