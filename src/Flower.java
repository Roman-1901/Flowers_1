public class Flower {
    private final String flowerName;
    private final String country;
    private double cost;
    private final int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank()) {
            flowerName = "Тип цветка не указан";
        }

        if (country == null || country.isEmpty() || country.isBlank()) {
            country = "Россия";
        }
        if (cost <= 0) {
            cost = 1;
        }
        if (lifeSpan < 0) {
            lifeSpan = Math.abs(lifeSpan);
        } else if (lifeSpan == 0) {
            lifeSpan = 3;
        }
        this.flowerName = flowerName;
        this.country = country;
        this.cost = cost;
        this.lifeSpan = lifeSpan;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }


    @Override
    public String toString() {
        return "Название: " + flowerName + ", страна " + country + ", цена " + String.format("%.2f", cost) + ", срок стояния " + lifeSpan;
    }
}