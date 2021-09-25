public class TesteCachorroGato {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Junin");
        Gato cat = new Gato("Gartola");

        System.out.printf("Gato\nnome: %s\nQuantidade de patas: %d\n", cat.getNome(), cat.getQuantidadePatas());
        System.out.printf("\nCachorro\nnome: %s\nQuantidade de patas: %d\n", dog.getNome(), dog.getQuantidadePatas());
    }
}
