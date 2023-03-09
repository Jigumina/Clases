import java.awt.*;
import java.util.ArrayList;

public class Perros {
    private String nombre;
    private String raza;
    private int edad;
    private Color color;

    public Perros() {
    }

    public Perros(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public Perros(String nombre, String raza, int edad, Color color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
      return raza;
    }

    public void setRaza(String raza) {
        ArrayList<String> razas = new ArrayList<>();
        razas.add("CHIHUAHUA");
        razas.add("PUG");
        razas.add("SCHNAUZER");
        razas.add("HUSKY");
        razas.add("PITBULL");

        if (razas.contains(raza.toUpperCase())) {
        this.raza = raza;
            this.raza = raza;
        } else {
            System.out.println("Esta raza no existe");
        }

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perros{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", color='" + color + '\'' +
                '}';
    }
}
