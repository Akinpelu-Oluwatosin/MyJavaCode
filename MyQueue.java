public class TheQueue {
    String[] name = new String[5];
    int front = 0;
    int rear = 0;
    int count = 0;

    public boolean isEmpty() {
        return count == 0;
    }

    public void AddQueue(String data) {
        if (count < name.length) {
            name[rear] = data;
            rear = (rear + 1) % name.length;
            count++;
        } else {
            System.out.println("Queue Overflow");
        }
    }

    public String RemoveQueue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return null;
        }
        String data = name[front];
        front = (front + 1) % name.length;
        count--;
        return data;
    }
}