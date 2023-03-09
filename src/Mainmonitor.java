public class Main {
    public static void main(String[] args) {
       Monitores Mon1 = new Monitores();
       Monitores Mon2 = new Monitores(25.7, "Asus", "Asustuf", "LED",280000.0 );
       Monitores Mon3 = new Monitores("Asus", "LED");

        System.out.println(Mon1);
        System.out.println(Mon2);
        System.out.println(Mon3);

        Mon1.setMarca("Aveo");
        System.out.println("Final");
    }
} 