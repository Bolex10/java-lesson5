public class Box <T> {

    private T value;

    public  void setValue(T value){
        this.value = value;
    }

    public  T getValue(){
        return this.value;
    }

    public  void printValue(){
        System.out.println("Value = "+ this.value);
    }

    @Override
    public String toString() {
      return this.value+" ";
    }
}
