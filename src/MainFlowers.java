public class MainFlowers {
    public static void main(String[] args) {
        Flower roze = new Flower("Роза", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", "", 15, 5);
        Flower pion = new Flower("Пион", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);

        Bouquet[] bouquet = new Bouquet[5];
        bouquet[0] = new Bouquet(roze, 5);
        bouquet[1] = new Bouquet(pion, 3);
        bouquet[2] = new Bouquet(chrysanthemum, 4);

        Bouquet.allInformationByBouquet(bouquet); //выводится полная информация по букету, в том числе цена и срок стояния

    }
}
