import java.awt.*;
import java.util.ArrayList;

public class Autos {
        private String marca;
        private String subMarca;
        private byte modelo;
        private Color color;

        ////constructor por defecto///////


    public Autos() {
    }

    public Autos(String marca, String subMarca, byte modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public Autos(String marca, String subMarca) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {

        return marca;
        }

        public void setMarca(String marca) {
            ArrayList<String> marcas = new ArrayList<>();
            marcas.add("VW");
            marcas.add("HONDA");
            marcas.add("TESLA");
            marcas.add("NISSAN");
            marcas.add("TOYOTA");

            if (marcas.contains(marca.toUpperCase())){
                this.marca = marca;
            } else {
                System.out.println("Esta marca no existe");
            }
        }
        public String getSubMarca() {
            return subMarca;
        }

        public void setSubMarca(String subMarca) {
            this.subMarca = subMarca;
        }

        public byte getModelo() {
            return modelo;
        }

        public void setModelo(byte modelo) {
            this.modelo = modelo;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Automoviles{" +
                    "marca='" + marca + '\'' +
                    ", subMarca='" + subMarca + '\'' +
                    ", modelo=" + modelo +
                    ", color=" + color +
                    '}';
        }
    }

