public class Hello {
    public static void main(String[] args) {
	Hello objHello = new Hello();
	String s = objHello.greet();
	System.out.println(s);
	Hello objHello2 = new Hello("Kay");
	s = objHello2.greet();
	System.out.println(s);
    }

    private String name;
    private String greeting;
    public Hello() {
	greeting = "Hello";
	name = "World";
    }
    public Hello(String name) {
	greeting = "Hello";
	name = name;//this.name = name;
    }
    public String greet() {
	return greeting + " " + name;
    }
}