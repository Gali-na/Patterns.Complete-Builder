public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Director director = new Director();
        System.out.println(director.build(new BuilderHonda()));


    }
}