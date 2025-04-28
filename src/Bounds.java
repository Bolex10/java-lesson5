import java.util.List;

public class Bounds {

    public  void run(){
        UnBounded();
    }

    private  void UnBounded(){
        List<Integer> list = List.of(3,4,5,6,7,9);
        List<String> list2 = List.of("King","Dog","Rat");
        List<Double> list3 = List.of(33.3,55.5,89.0);

        //print1(list);
       // print1(list2);

      //  print2(list);
       // print2(list3);

       // adjust(list);
        //print1(list);

    }

    // readonly
    private void print1(List<?> list){

        for (var val : list){
          System.out.print(val+ " ");
        }
        System.out.println();
    }

    // readonly
    private void print2(List<? extends Number> list){

        for (var val : list){
            System.out.print(val+ " ");
        }
        System.out.println();
    }

    private void adjust(List<? super Integer> list){
        list.add(66);
        list.add(33);
        list.add(99);
    }

}
