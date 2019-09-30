import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import static javafx.scene.input.KeyCode.T;

public class Cola {
   private Queue<Persona> cola = new LinkedList<Persona>();
   public void add(Persona persona){
       cola.add(persona);
   }
   public void remove(Persona persona){
       cola.remove(persona);
   }
   public int countPersonas(){
       return  cola.size();
   }
}
