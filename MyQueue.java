public class TheQueue {
    public static void main(String[] args){
    
    String[] names = new String[5];
    int count = 0;

   
    public boolean isEmpty() {
        return count == 0;
    }

   
    public void addQueue(String name) {

         q.addQueue("Tayo");
        q.addQueue("Tosin");
        q.addQueue("Tope");

        if (count < names.length) {
            names[count] = name;
            count++;
}
        else {
            System.out.println("Queue is full!");
 }
    }

   
    public String removeQueue() {
        q.displayQueue();
        q.removeQueue();
        q.displayQueue();
        
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }

        String removed = names[0];
    
        for (int index = 0; index < count - 1; index++) {
            names[index] = names[index + 1];
        }

        count--;
        names[count] = null;
        return removed;
    }

   
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue: ");
            for (int count = 0; count < count; count++) {
                System.out.print(names[count] + " ");
            }
            System.out.println();
        }
    }


  
        

    }
}
}
