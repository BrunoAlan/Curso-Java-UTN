import Interfaces.CarnivorosInterface;

public class Gato extends Animal implements CarnivorosInterface {

    @Override
    public void hablar() {
        System.out.println("GATO => Maullar");
    }

    @Override
    public void comerCarne() {
        System.out.println("GATO => Come carne");
    }

    @Override
    public void comer() {
        comerCarne();
    }
}
