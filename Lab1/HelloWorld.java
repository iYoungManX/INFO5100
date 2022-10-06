package Lab1;
/*
    Assigment 1
    Zonghui Yao   SECTION 8
    NUID: 001316266
 */

public class HelloWorld {
    private String greeting = "Hello World";

    public HelloWorld() {
    }

    public HelloWorld(String greeting) {
        this.greeting = greeting;
    }

    public void greet()

    {
        System.out.println(greeting);
    }

    public static void main(String args[]) {
        HelloWorld helloworld;
        helloworld = new HelloWorld();
        helloworld.greet();
        HelloWorld helloworld2 = new HelloWorld("Hi, How are you today");
        helloworld2.greet();
    }
}
