import Interfaces.CarnivorosInterface;

public class Perro extends Animal implements CarnivorosInterface {

    @Override
    public void hablar() {
        System.out.println("PERRO => Ladrar");
    }

    @Override
    public void comerCarne() {
        System.out.println("PERRO => Come carne");
    }

    @Override
    public void comer() {
        comerCarne();
    }
}
