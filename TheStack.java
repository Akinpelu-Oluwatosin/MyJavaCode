
public class TheStack {
    String[] name = new String[5];
    int count = 0;

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String data) {
        if (count < name.length) {
            name[count++] = data;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return name[--count];
    }
}
