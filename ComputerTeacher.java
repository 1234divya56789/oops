/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/

class Teacher {
    String collegeName;
    String designation;

    public Teacher(String collegeName, String designation) {
        this.collegeName = collegeName;
        this.designation = designation;
    }

    public void work() {
        System.out.println(designation + "\t" + collegeName);
    }
}

class ComputerTeacher extends Teacher {
    public ComputerTeacher(String collegeName) {
        super(collegeName, "ComputerTeacher");
    }
}

public class Main {
    public static void main(String[] args) {
        ComputerTeacher computerTeacher = new ComputerTeacher("IIT");

        System.out.println("Designation\tCollegeName");
        computerTeacher.work();
    }
}

