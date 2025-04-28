public class Tools <T>{

    private T tool;

    public  void setTools(T tool){
        this.tool =tool;
    }

    public <M> void repair(M machine){
        System.out.println("Machine "+machine+" has repaired tool "+ tool);
    }
}
