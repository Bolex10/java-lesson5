public class Bmw extends Car  implements  Flyable{

    public Bmw(String name){
        super(name);
    }
    @Override
    public void fly() {
        System.out.println("BMW Flying");
    }
}
