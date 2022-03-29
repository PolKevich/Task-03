package by.training.task03.booktask;

public class AggregatingMass {

    private int counter = 0;
    Book [] arr = new Book[3];

    public void setArr(Book b){
        arr[counter] = b;
        counter++;

    }

    public void printAggregatingMass (){
        for(Book b : arr ){
            System.out.println(b);
        }

    }

    public void printBookOfAuthor(String str){
        for (int i = 0; i < arr.length; i++){
           if(arr[i].getAuthor().equals(str)){
               System.out.println(arr[i].getNameOfTheBook());
           }

        }

    }

    public void printPublishingHouse(String str){
        for (int i = 0; i < arr.length; i++){
            if(arr[i].getPublishingHouse().equals(str)){
                System.out.println(arr[i].getNameOfTheBook());
            }

        }

    }

    public void printPublishedSince(int q){
        for (int i = 0; i < arr.length; i++){
            if(arr[i].getYearOfPublishing() > q){
                System.out.println(arr[i].getNameOfTheBook());
            }

        }
    }
}
