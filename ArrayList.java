import java.util.ArrayList;

public class StudentList {

   
    private ArrayList<String> students = new ArrayList<>();

   
    public void addStudent(String name) {
	 StudentList list = new StudentList();

     
        list.addStudent("Tosin");
        list.addStudent("Tayo");
        list.addStudent("Tope");

        students.add(name);
        System.out.println(name + " has been added.");
}

    
    public void removeStudent(String name) {

	list.removeStudent("Tope");

        if (students.remove(name)){

            System.out.println(name + " has been removed.");
}
	else{
            System.out.println(name + " not found in the list.");
}
}


    public void displayStudents() {
        for (String student : students) {
            System.out.println(student);
}
}

    
    public static void main(String[] args) {
        StudentList list = new StudentList();

     
        list.addStudent("Tosin");
        list.addStudent("Tayo");
        list.addStudent("Tope");

        list.displayStudents();

        list.removeStudent("Tope");

        list.displayStudents();
}
}