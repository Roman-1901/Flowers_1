public class Bouquet {

    private final Flower flowerAll;
    private int count;


    public Bouquet(Flower flowerAll, int count) {
        this.flowerAll = flowerAll;
        this.count = count;
    }

    public Flower flowerAll() {
        return flowerAll;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private static double priceResult(Bouquet[] array) {  //рассчет стоимости букета
        double price = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) continue;
            price += array[i].getCount() * array[i].flowerAll().getCost();
        }
        price += price * 0.1;
        return price;
    }

    private static int minLifeSpan(Bouquet[] array) {         // высчитывается наименьший срок стояния
        int min = array[0].flowerAll().getLifeSpan();
        for (int i = 1; i < array.length; i++) {
            if (array[i] == null) continue;
            if (array[i].flowerAll().getLifeSpan() < min) {
                min = array[i].flowerAll().getLifeSpan();
            }
        }
        return min;
    }

    public static void allInformationByBouquet(Bouquet[] array) { // вывод полной информации по букету
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) continue;
            System.out.println(array[i]);
        }
        System.out.println("Цена букета " + String.format("%.2f",priceResult(array)));
        System.out.println("Срок стояния " + minLifeSpan(array));
    }

    @Override
    public String toString() {
        return flowerAll.getFlowerName() + ", страна " + flowerAll.getCountry() + ", цена за 1 шт. " + String.format("%.2f", flowerAll.getCost()) + ", срок стояния " + flowerAll.getLifeSpan() + ", количество штук: " + count;
    }
}