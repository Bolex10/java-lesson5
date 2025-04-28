import java.util.List;
import java.util.function.Function;

public class LamdaDemo {
    public  void run(){

    }

    void demo1(){
        // single line
       // x -> x * x;
        // ()-> System.out.print("Hello");
        // (x,y) -> x+y;


        // multiple line
       /* x -> {
            var y = x* x;
            System.out.println(y);
            return  y;
        } */





    }

    public  int square(int x){
        return  x * x;
    }

    public void print(){
        System.out.println("Hello");
    }

    public  static  void main(String [] args){
        FunctionalInterface1 func = (x, y) -> x + y;

        var ans =  func.add(7,9);
        System.out.println(" Ans = "+ans);

    }


}
