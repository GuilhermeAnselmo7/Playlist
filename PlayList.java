import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args) {
    ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
    listaParaIlhaDeserta.add("Musica1");
    listaParaIlhaDeserta.add("Musica2");
    listaParaIlhaDeserta.add("Musica3");
    listaParaIlhaDeserta.add("Musica4");
    listaParaIlhaDeserta.add("Musica5");
    listaParaIlhaDeserta.add("Musica6");
    listaParaIlhaDeserta.add("Musica7");
    listaParaIlhaDeserta.add("Musica8");
    listaParaIlhaDeserta.add("Musica9");
    listaParaIlhaDeserta.add("Musica10");
    System.out.println(listaParaIlhaDeserta.size());
    listaParaIlhaDeserta.remove(0);
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());
    listaParaIlhaDeserta.remove(3);
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());
    listaParaIlhaDeserta.remove(7);
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());
    listaParaIlhaDeserta.remove(2);
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());
    listaParaIlhaDeserta.remove(4);
    System.out.println(listaParaIlhaDeserta);
    System.out.println(listaParaIlhaDeserta.size());

    int indiceMusicaA = 1;
    int indiceMusicaB = 4;
    String tempA = listaParaIlhaDeserta.get(indiceMusicaA);
    listaParaIlhaDeserta.set(indiceMusicaA, listaParaIlhaDeserta.get(indiceMusicaB));
    listaParaIlhaDeserta.set(indiceMusicaB, tempA);
    System.out.println("Lista com músicas trocadas:");
    System.out.println(listaParaIlhaDeserta);
    tempA = listaParaIlhaDeserta.get(indiceMusicaA);
    listaParaIlhaDeserta.set(indiceMusicaA, listaParaIlhaDeserta.get(indiceMusicaB));
    listaParaIlhaDeserta.set(indiceMusicaB, tempA);
    System.out.println("Lista final com músicas trocadas de volta:");
    System.out.println(listaParaIlhaDeserta);
    }
}