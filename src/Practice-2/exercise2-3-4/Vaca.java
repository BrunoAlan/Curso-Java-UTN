import Interfaces.HervivorosInterface;

public class Vaca extends Animal implements HervivorosInterface {

    @Override
    public void hablar() {
        System.out.println("VACA => Mugir");
    }

    @Override
    public void comerHierva() {
        System.out.println("VACA => Come hierva");
    }

    @Override
    public void comer() {
        comerHierva();
    }
}
