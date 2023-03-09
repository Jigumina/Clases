import java.util.ArrayList;

public class Monitores {
    private double pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;

    public Monitores() {
    }

    public Monitores(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public Monitores(double pulgadas, String marca, String modelo, String tipo, double precio) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
        ArrayList<String>marcas = new ArrayList<>();
            marcas.add ("Asus");
            marcas.add("HP");
            marcas.add("Apple");
            marcas.add("Dell");
        if (marcas.contains(marca.toUpperCase())){
            this.marca = marca;
        } else {
            System.out.println("Esta marca no existe");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitores{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
