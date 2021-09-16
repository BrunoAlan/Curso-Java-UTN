public class Principal {

    public static void main(String[] args) {

        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        System.out.println("METODOS HABLAR");
        hablarAnimal(perro);
        hablarAnimal(gato);
        hablarAnimal(vaca);

        System.out.println("METODOS COMER");
        comerAnimal(perro);
        comerAnimal(gato);
        comerAnimal(vaca);
    }

    private static void hablarAnimal(Animal animal) {
        animal.hablar();
    }

    private static void comerAnimal(Animal animal) {
        animal.comer();
    }

}
