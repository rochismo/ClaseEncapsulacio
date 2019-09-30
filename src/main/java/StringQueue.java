public class StringQueue implements Enqueuer {

    private String queue = "";

    public void add(Persona person) {
        int length = getLength();
        if (length == 0) {
            queue += person.getNombre();
        } else {
            queue += "/" + person.getNombre();
        }
    }

    public void remove(Persona person) {
        if (getLength() == 0) {
            return;
        }
        String[] currentQueue = queue.split("/");
        queue = "";
        for (String element : currentQueue) {
            if (element.equals(person.getNombre())) {
                continue;
            }
            this.add(person);
        }
    }

    public int getLength() {
        return queue.split("/").length;
    }
}
