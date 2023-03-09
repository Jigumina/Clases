public class Main {
    public static void main(String[] args) {
        Personas per1 = new Personas();
        Personas per2 = new Personas(18, "Roberto", 1.75, 53, "Femenino");
        Personas per3 = new Personas("Luis", 53);

        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);

        System.out.println("Fin");
    }
}