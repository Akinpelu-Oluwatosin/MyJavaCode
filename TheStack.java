
public class TheStack {
    String[] name = new String[5];
    int count = 0;

    public boolean isEmpty() {
        return count == 0;
    }

    public void push(String data) {

	name.push("Tayo");
        name.push("Tosin");
        name.push("Tope");

        if (count < name.length) {
            name[count++] = theElement;
} 
	
	else {
            System.out.println("Stack Overflow");
}
}

    public String toRemove() {

	name.pop("Tope");
	name.pop("Tosin");
	name.pop("Tope");
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
}
        return name[--count];
}
}




