public class Tesla  extends  Car implements  Flyable{

    public Tesla(String name){
        super(name);
    }
    @Override
    public void fly() {
        System.out.println("Tesla Flying");
    }
}
