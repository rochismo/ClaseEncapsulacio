public class StringQueue implements Enqueuer {

    private String queue = "";

    public void add(String name) {
        if (queue.equals("")) {
            queue += name;
        } else {
            queue += "/" + name;
        }
    }

    public void remove() {
        if (queue.equals("")) {
            return;
        }
        String[] currentQueue = queue.split("/");
        queue = "";
        for (String element : currentQueue) {
            if (element.equals(currentQueue[0])) {
                continue;
            }
            this.add(element);
        }
    }

    public int getLength() {
        return queue.equals("") ? 0 : queue.split("/").length;
    }
}
