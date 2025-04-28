import java.net.Socket;

public class ClientHandler implements Runnable {

    String client ;
    int sleepTime ;


    public  ClientHandler(String clientName, int sleepT){
       this.client= clientName;
       this.sleepTime = sleepT;
    }

    @Override
    public void run() {
          for(; ;){
              System.out.println("Client Name : "+ this.client);
              try {
                  Thread.sleep(this.sleepTime);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
    }
}
