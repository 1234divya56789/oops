/* JFM1T9_Assignment5:
	Create an object named obj of the class Main and print the reference to the object using this keyword.
        
        Sample Output:
        Sport name: Football
*/ 
      

class Main {
    private String sportName;

    public Main(String sportName) {
        this.sportName = sportName;
    }

    public void printReference() {
        System.out.println("Sport name: " + this.sportName);
    }

    public static void main(String[] args) {
        Main obj = new Main("Football");
        obj.printReference();
    }
}

// Print the value of Sport name using "this" reference

