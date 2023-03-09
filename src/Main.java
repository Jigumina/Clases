import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Perros perr1 = new Perros();
        Perros perr2 = new Perros("Princesa", "Pitbull", 2, Color.WHITE);
        Perros perr3 = new Perros("Demonio", "Chihuahua");

        System.out.println(perr1);
        perr1.setRaza("Husky");
        System.out.println(perr2);
        System.out.println(perr3);

        System.out.println("Fin");
    }
}