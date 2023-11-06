/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/

//Add Teacher class

//Add MathTeacher class

//Add EnglishTeacher class

//Add MusicTeacher class

class CollegePrincipal {

//Add the main method here and create all different types of Teacher objects and print there college name designation.
  class Teacher {
      private String collegeName;
      private String designation;

      public Teacher(String collegeName, String designation) {
          this.collegeName = collegeName;
          this.designation = designation;
      }

      public void work() {
          System.out.println(designation + " Teacher\t" + collegeName);
      }
  }

  class MathTeacher extends Teacher {
      public MathTeacher(String collegeName) {
          super(collegeName, "Math");
      }
  }

  class EnglishTeacher extends Teacher {
      public EnglishTeacher(String collegeName) {
          super(collegeName, "English");
      }
  }

  class MusicTeacher extends Teacher {
      public MusicTeacher(String collegeName) {
          super(collegeName, "Music");
      }
  }

  public class Main {
      public static void main(String[] args) {
          String collegeName = "IIT";

          MathTeacher mathTeacher = new MathTeacher(collegeName);
          EnglishTeacher englishTeacher = new EnglishTeacher(collegeName);
          MusicTeacher musicTeacher = new MusicTeacher(collegeName);

          mathTeacher.work();
          englishTeacher.work();
          musicTeacher.work();
      }
  }

}