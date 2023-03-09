import java.awt.*;

public class Main {
    public static void main(String[] args) {
    Autos auto1 = new Autos();
    Autos auto2 = new Autos("Nissan", "Polo", (byte)15, Color.cyan);
    Autos auto3 = new Autos("Toyota", "Polo");
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);

        auto1.setMarca("Nissan");

        System.out.println("Fin");




    }
}