import java.util.LinkedList;
import java.util.Queue;

public class Cola implements Enqueuer{
   private Queue<String> cola = new LinkedList<String>();
   public void add(String persona){
       cola.add(persona);
   }

   public void remove(){
       cola.poll();
   }

    public int getLength() {
        return cola.size();
    }
}
