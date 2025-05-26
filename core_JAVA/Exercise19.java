Interface Implementation:


interface Playable { void play(); }
class Guitar implements Playable { public void play() { System.out.println("Strum"); } }
class Piano implements Playable { public void play() { System.out.println("Plink"); } }
public class Music {
    public static void main(String[] args) {
        Playable g = new Guitar(), p = new Piano();
        g.play(); p.play();
    }
}