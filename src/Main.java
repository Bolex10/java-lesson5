import javax.tools.Tool;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

      /* Box<Integer> box1 = new Box<>();
       box1.setValue(77);
       Integer returnValue = box1.getValue();
       box1.printValue();

       Box<String> box2 = new Box<>();
       box2.setValue("James");
       box2.printValue();

       Number x1 = 33;
       Number x2 = 66.0;

  Printer printer = new Printer();

  printer.print("James Bond");
  printer.print(55);
  printer.print(77_000.00);
  printer.print(box1);
  printer.print(box2);

        Mapper<String,Double> mapper = new Mapper<>();
        mapper.add("James",89.9);

        System.out.println("Student Name ="+mapper.getKey()+" : Score="+mapper.getValue());

        Mapper<String,String> mapper2 = new Mapper<>();
        mapper2.add("Engineering","Fred Amata");
        System.out.println("Department Name ="+mapper2.getKey()+" : Student="+mapper2.getValue());

        Tools<Character> tools = new Tools<>();
        tools.setTools('H');
        tools.repair("Tractor");

     */

     Bounds bounds = new Bounds();
     bounds.run();

    //new Thread(new ClientHandler("James",2000)).start();
   // new Thread(new ClientHandler("King",200)).start();
   // new Thread(new ClientHandler("Flex",1000)).start();


    }


}