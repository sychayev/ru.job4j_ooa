import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    public void method(){
        Task t = new Task("a",5);
        System.out.println(t);
//        tasks.add(2,t);

    }

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определяется по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;

        for (Task element : tasks) {
            element.getPriority();
            element.getDesc();
            System.out.println(element);
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }

    public static void main(String[] args) {
        PriorityQueue p = new PriorityQueue();

       p.method();


    }
}
