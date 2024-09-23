package Oops;

class Pen{
    String color;   // blueprints
    String type;    // defines attribues or properties or behavier


public void write(){
    System.out.println("Writing something");  // defines the method of the object
}
}

public class opps {
    // basic for creating classes and object
    public static void main(String[] args) {
        Pen pen1=new Pen();
        pen1.color="blue";
        pen1.color="gel";

        pen1.write();
    }

    
}


