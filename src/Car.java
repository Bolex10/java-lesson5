import java.util.ArrayList;
import java.util.List;

public class Car {

    String color;
    private String name;
    public Car(String name){
        this.name = name;
    }

    public  void move(){
        System.out.println(name+" Moving");
    }

    public  void honk(){
        System.out.println(name+ " Honking");
    }

    public  static  void  main(String[] args){
        List<Car> list = new ArrayList<>();
        list.add(new Toyota("Toyota"));
        list.add(new Honda("Honda"));
        list.add(new Bmw("Bmw"));
        list.add(new Tesla("Tesla"));
        list.add(new Toyota("Toyota"));

        for (Car car : list){
           if(car instanceof Flyable){
               ((Flyable) car).fly();
           }
        }
    }

}
