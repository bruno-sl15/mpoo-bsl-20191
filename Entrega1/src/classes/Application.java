package classes;

public class Application {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setNome("Bruno");
        helloWorld.imprimir();
        
        HelloWorld helloWorld2 = new HelloWorld();
        helloWorld2.setNome("Fulano");
        helloWorld2.imprimir();
        
        HelloWorld helloWorld3 = new HelloWorld();
        helloWorld3.setNome("Ciclano");
        helloWorld3.imprimir();
        
        HelloWorld helloWorld4 = new HelloWorld();
        helloWorld4.imprimir();

    }
}
