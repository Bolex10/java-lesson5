import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

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

        List<Integer> numbers = Arrays.asList(7,4,5,2,9,3);
        Comparator<Integer> comparator = (x,y) -> y -x;

        numbers.sort(comparator);

        System.out.println(numbers);


        Predicate<Integer>  predicate = (x)-> x % 2==0;

        Predicate<Integer> below18 = (x) -> x < 18 ;

        System.out.println("7 is even number  = "+ predicate.test(7));

        System.out.println(" 19 is below 18  = "+ below18.test(19));


        Consumer<String> printer = (x)-> System.out.println(x);

        printer.accept("Hello World");
        printer.accept("This is java ");

        double salary =0.0;

        Function<Integer,Double> compInterest = (loan)-> loan * 0.25 * 6;
        Function<Integer, Double> comAdvanceIntrest = (loan)-> loan * 5.25 * 20;

        System.out.println("Intrest on loan 50_000 ="+ compInterest.apply(50_000));
        System.out.println("Intrest on loan 50_000 ="+ comAdvanceIntrest.apply(50_000));

        BinaryOperator<Double> compLoan = (amount,rate)-> (amount * rate * 12) + amount;

        System.out.println("Total payable after 12 months on loan 50_000 ="+ compLoan.apply(50_000.0, 0.25));

        UnaryOperator<Integer>  increment = (x)-> x++;
        
        
        int[] counter ={0};
        
        Runnable runnable = ()-> counter[0]++;
        runnable.run();
        runnable.run();
        runnable.run();
        
        System.out.println("Counter = "+counter[0]);


        List<String> names = Arrays.asList("James","Ben","King","Nothing");

       // names.stream().forEach(System.out::print);

       // names.stream().forEach( (name)-> System.out.print(name));

        //names.stream().forEach(Emmiter::print);

        System.out.println();

        Emmiter emmiter = new Emmiter();

      //  names.stream().forEach(emmiter::print2);

        // Terminal  operation
        String allName = String.valueOf(names.stream().reduce( (x, y)-> x.concat(" "+y)));

        // Intermediate Operation
        names.stream()
                .map(name-> name+"-"+ name.length())
                .map(name-> name+"-"+ name.length())
                .map(name-> name+"-"+ name.length())
                .forEach(Emmiter::print);

        System.out.println(allName.toString());





    }

    public  void computeSalary(Consumer<Integer> func){

    }


}
