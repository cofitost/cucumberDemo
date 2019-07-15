package selab.cofitost.cucumberDemo;

public class Greeting {
    private final String greeting;

    public Greeting(String greeting){
        this.greeting = greeting;
    }

    public String sayHi(){
        return greeting;
    }
}