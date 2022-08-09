package dress_shop;

public class Dress {

    final private String name;
    final private Double commodityPrice;

    public String getName() {
        return name;
    }

    public Double getCommodityPrice() {
        return commodityPrice;
    }

    public Double getProfit() {
        return commodityPrice * 0.25;
    }

    public Double getWholesalerPrice() {
        return commodityPrice / 2;
    }

    public Dress(String name, Double commodityPrice) {
        this.name = name;
        this.commodityPrice = commodityPrice;
    }
}
